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

    /** Called by UserPopulator to persist seed user data before tests run. */
    @Transactional
    public void save(UserRecord user) {
        userRepository.save(user);
        log.info("User saved: id={} name={}", user.getId(), user.getName());
    }

    /** Validates a transaction and persists it if all three rules pass. */
    @Transactional
    public void process(Transaction transaction) {

        UserRecord sender = userRepository.findById(transaction.getSenderId());
        if (sender == null) {
            log.warn("Discarding — sender {} not found", transaction.getSenderId());
            return;
        }

        UserRecord recipient = userRepository.findById(transaction.getRecipientId());
        if (recipient == null) {
            log.warn("Discarding — recipient {} not found", transaction.getRecipientId());
            return;
        }

        if (sender.getBalance() < transaction.getAmount()) {
            log.warn("Discarding — sender {} balance {} < amount {}",
                    sender.getId(), sender.getBalance(), transaction.getAmount());
            return;
        }

        transactionRepository.save(
                new TransactionRecord(sender, recipient, transaction.getAmount()));

        sender.setBalance(sender.getBalance() - transaction.getAmount());
        recipient.setBalance(recipient.getBalance() + transaction.getAmount());
        userRepository.save(sender);
        userRepository.save(recipient);

        log.info("WALDORF_BALANCE_CHECK: user={} balance={}", sender.getName(),    sender.getBalance());
        log.info("WALDORF_BALANCE_CHECK: user={} balance={}", recipient.getName(), recipient.getBalance());
    }
}