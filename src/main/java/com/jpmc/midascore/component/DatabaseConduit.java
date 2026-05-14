package com.jpmc.midascore.component;

import com.jpmc.midascore.entity.TransactionRecord;
import com.jpmc.midascore.entity.UserRecord;
import com.jpmc.midascore.foundation.Incentive;
import com.jpmc.midascore.foundation.Transaction;
import com.jpmc.midascore.repository.TransactionRepository;
import com.jpmc.midascore.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

/**
 * Central database gateway for Midas Core.
 *
 * Responsibilities:
 *  - save(UserRecord)     : seed users from test data (called by UserPopulator)
 *  - process(Transaction) : validate → call Incentive API → persist → update balances
 */
@Component
public class DatabaseConduit {

    private static final Logger log = LoggerFactory.getLogger(DatabaseConduit.class);

    private static final String INCENTIVE_API_URL = "http://localhost:8080/incentive";

    private final UserRepository        userRepository;
    private final TransactionRepository transactionRepository;
    private final RestTemplate          restTemplate;

    public DatabaseConduit(UserRepository userRepository,
                           TransactionRepository transactionRepository,
                           RestTemplateBuilder restTemplateBuilder) {
        this.userRepository        = userRepository;
        this.transactionRepository = transactionRepository;
        this.restTemplate          = restTemplateBuilder.build();
    }

    /**
     * Persists a UserRecord directly.
     * Called by UserPopulator to load seed users before tests run.
     */
    @Transactional
    public void save(UserRecord user) {
        userRepository.save(user);
        log.info("User saved: id={} name={} balance={}", user.getId(), user.getName(), user.getBalance());
    }

    /**
     * Validates and processes a transaction.
     *
     * Validation rules (all must pass):
     *  1. sender exists
     *  2. recipient exists
     *  3. sender.balance >= transaction.amount
     *
     * On success:
     *  - POST transaction to Incentive API to get incentive amount
     *  - Persist TransactionRecord (amount + incentive)
     *  - Debit sender by transaction.amount (incentive is NOT deducted from sender)
     *  - Credit recipient by transaction.amount + incentive
     *
     * On failure: discard silently, no DB state modified.
     */
    @Transactional
    public void process(Transaction transaction) {

        // Rule 1 — sender exists?
        UserRecord sender = userRepository.findById(transaction.getSenderId());
        if (sender == null) {
            log.warn("Discarding — sender {} not found", transaction.getSenderId());
            return;
        }

        // Rule 2 — recipient exists?
        UserRecord recipient = userRepository.findById(transaction.getRecipientId());
        if (recipient == null) {
            log.warn("Discarding — recipient {} not found", transaction.getRecipientId());
            return;
        }

        // Rule 3 — sufficient balance?
        if (sender.getBalance() < transaction.getAmount()) {
            log.warn("Discarding — sender {} balance {} < amount {}",
                    sender.getId(), sender.getBalance(), transaction.getAmount());
            return;
        }

        // Call Incentive API — POST the Transaction, receive Incentive response
        float incentiveAmount = 0f;
        try {
            Incentive incentive = restTemplate.postForObject(
                    INCENTIVE_API_URL, transaction, Incentive.class);
            if (incentive != null) {
                incentiveAmount = incentive.getAmount();
            }
        } catch (Exception e) {
            // If the Incentive API is unreachable, proceed with incentive = 0
            log.warn("Incentive API call failed ({}), proceeding with incentive=0", e.getMessage());
        }

        log.info("Transaction processed: sender={} recipient={} amount={} incentive={}",
                sender.getName(), recipient.getName(), transaction.getAmount(), incentiveAmount);

        // Persist the transaction record with both amount and incentive
        transactionRepository.save(
                new TransactionRecord(sender, recipient, transaction.getAmount(), incentiveAmount));

        // Update balances:
        //   sender   pays  transaction.amount          (incentive is NOT subtracted from sender)
        //   recipient gets transaction.amount + incentive
        sender.setBalance(sender.getBalance() - transaction.getAmount());
        recipient.setBalance(recipient.getBalance() + transaction.getAmount() + incentiveAmount);
        userRepository.save(sender);
        userRepository.save(recipient);

        log.info("Balance update: sender={} newBalance={} | recipient={} newBalance={}",
                sender.getName(), sender.getBalance(),
                recipient.getName(), recipient.getBalance());
    }
}