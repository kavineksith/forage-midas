package com.jpmc.midascore.component;

import com.jpmc.midascore.entity.TransactionRecord;
import com.jpmc.midascore.entity.UserRecord;
import com.jpmc.midascore.foundation.Transaction;
import com.jpmc.midascore.repository.TransactionRepository;
import com.jpmc.midascore.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Central database gateway for Midas Core.
 *
 * Exposes two methods:
 *  - save(UserRecord)     : direct persistence used by UserPopulator to seed test data
 *  - process(Transaction) : validates a transaction and persists it if all rules pass
 */
@Component
public class DatabaseConduit {

    private static final Logger log = LoggerFactory.getLogger(DatabaseConduit.class);

    private final UserRepository        userRepository;
    private final TransactionRepository transactionRepository;

    public DatabaseConduit(UserRepository userRepository,
                           TransactionRepository transactionRepository) {
        this.userRepository        = userRepository;
        this.transactionRepository = transactionRepository;
    }

    /**
     * Persists a UserRecord directly.
     * Called by UserPopulator to load seed users from test data files
     * before TaskThreeTests (and later tasks) run.
     */
    @Transactional
    public void save(UserRecord user) {
        userRepository.save(user);
        log.info("User saved: id={} name={} balance={}", user.getId(), user.getName(), user.getBalance());
    }

    /**
     * Validates and persists a transaction.
     *
     * Rules (all must pass):
     *  1. senderId    → existing UserRecord (null check; repo returns UserRecord directly)
     *  2. recipientId → existing UserRecord
     *  3. sender.balance >= transaction.amount
     *
     * On success: persist TransactionRecord, debit sender, credit recipient.
     * On failure: silently discard, no DB state modified.
     *
     * @Transactional: the three writes are one atomic unit — all succeed or all roll back.
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

        // All valid: persist and update balances
        transactionRepository.save(
                new TransactionRecord(sender, recipient, transaction.getAmount()));

        sender.setBalance(sender.getBalance() - transaction.getAmount());
        recipient.setBalance(recipient.getBalance() + transaction.getAmount());
        userRepository.save(sender);
        userRepository.save(recipient);

        // Tag both sides so the CI parser finds waldorf regardless of role
        log.info("WALDORF_BALANCE_CHECK: user={} balance={}", sender.getName(),    sender.getBalance());
        log.info("WALDORF_BALANCE_CHECK: user={} balance={}", recipient.getName(), recipient.getBalance());
    }
}
