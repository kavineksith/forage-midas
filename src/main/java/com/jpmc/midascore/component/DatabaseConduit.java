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

@Component
public class DatabaseConduit {

    private static final Logger log = LoggerFactory.getLogger(DatabaseConduit.class);
    private static final String INCENTIVE_URL = "http://localhost:8080/incentive";

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

    @Transactional
    public void save(UserRecord user) {
        userRepository.save(user);
        log.info("User saved: id={} name={} balance={}", user.getId(), user.getName(), user.getBalance());
    }

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
            log.warn("Discarding — sender {} insufficient balance", sender.getName());
            return;
        }

        // Call Incentive API
        float incentiveAmount = 0f;
        try {
            Incentive incentive = restTemplate.postForObject(
                    INCENTIVE_URL, transaction, Incentive.class);
            if (incentive != null) {
                incentiveAmount = incentive.getAmount();
            }
        } catch (Exception e) {
            log.warn("Incentive API unavailable, using incentive=0: {}", e.getMessage());
        }

        // Persist transaction record
        transactionRepository.save(
                new TransactionRecord(sender, recipient,
                        transaction.getAmount(), incentiveAmount));

        // Debit sender by amount only (incentive NOT deducted from sender)
        // Credit recipient by amount + incentive
        sender.setBalance(sender.getBalance() - transaction.getAmount());
        recipient.setBalance(recipient.getBalance() + transaction.getAmount() + incentiveAmount);
        userRepository.save(sender);
        userRepository.save(recipient);

        log.info("Processed: sender={} newBal={} | recipient={} newBal={} | incentive={}",
                sender.getName(), sender.getBalance(),
                recipient.getName(), recipient.getBalance(),
                incentiveAmount);
    }
}
