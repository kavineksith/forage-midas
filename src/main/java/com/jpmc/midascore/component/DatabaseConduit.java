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
 * Validates incoming transactions and persists the ones that pass.
 *
 * Validation rules (all three must hold):
 *  1. senderId refers to an existing UserRecord
 *  2. recipientId refers to an existing UserRecord
 *  3. sender.balance >= transaction.amount
 *
 * On success: persist TransactionRecord, debit sender, credit recipient.
 * On failure: discard silently — no DB state modified.
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

        // All valid: persist and adjust balances
        transactionRepository.save(new TransactionRecord(sender, recipient, transaction.getAmount()));

        sender.setBalance(sender.getBalance() - transaction.getAmount());
        recipient.setBalance(recipient.getBalance() + transaction.getAmount());
        userRepository.save(sender);
        userRepository.save(recipient);

        log.info("WALDORF_BALANCE_CHECK: user={} balance={}", sender.getName(),    sender.getBalance());
        log.info("WALDORF_BALANCE_CHECK: user={} balance={}", recipient.getName(), recipient.getBalance());
    }
}