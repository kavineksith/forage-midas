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

import java.util.Optional;

/**
 * Validates incoming transactions and persists the ones that pass.
 *
 * Validation rules (all three must hold):
 *  1. senderId refers to an existing UserRecord.
 *  2. recipientId refers to an existing UserRecord.
 *  3. The sender's balance is >= the transaction amount.
 *
 * On success:
 *  • A {@link TransactionRecord} is persisted with @ManyToOne refs to sender/recipient.
 *  • Sender balance is decremented by the transaction amount.
 *  • Recipient balance is incremented by the transaction amount.
 *
 * On failure:
 *  • The transaction is silently discarded; no DB state is modified.
 *
 * @Transactional ensures that the three writes (insert + two updates) either
 * all succeed or all roll back — critical for financial data integrity.
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

        // ── Rule 1: sender must exist ─────────────────────────────────────
        Optional<UserRecord> senderOpt =
                userRepository.findById(transaction.getSenderId());
        if (senderOpt.isEmpty()) {
            log.warn("Invalid transaction — sender {} not found", transaction.getSenderId());
            return;
        }

        // ── Rule 2: recipient must exist ──────────────────────────────────
        Optional<UserRecord> recipientOpt =
                userRepository.findById(transaction.getRecipientId());
        if (recipientOpt.isEmpty()) {
            log.warn("Invalid transaction — recipient {} not found", transaction.getRecipientId());
            return;
        }

        UserRecord sender    = senderOpt.get();
        UserRecord recipient = recipientOpt.get();

        // ── Rule 3: sender balance must cover the amount ──────────────────
        if (sender.getBalance() < transaction.getAmount()) {
            log.warn("Invalid transaction — sender {} has insufficient balance ({} < {})",
                    sender.getId(), sender.getBalance(), transaction.getAmount());
            return;
        }

        // ── All rules passed: persist and update balances ─────────────────
        transactionRepository.save(
                new TransactionRecord(sender, recipient, transaction.getAmount())
        );

        sender.setBalance(sender.getBalance() - transaction.getAmount());
        recipient.setBalance(recipient.getBalance() + transaction.getAmount());

        userRepository.save(sender);
        userRepository.save(recipient);

        log.info("Transaction recorded: {} → {} | amount={} | sender_balance={} | recipient_balance={}",
                sender.getId(), recipient.getId(),
                transaction.getAmount(),
                sender.getBalance(),
                recipient.getBalance());
    }
}