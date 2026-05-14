package com.jpmc.midascore.component;

import com.jpmc.midascore.foundation.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionKafkaListener {

    private static final Logger log =
            LoggerFactory.getLogger(TransactionKafkaListener.class);

    private final DatabaseConduit databaseConduit;

    public TransactionKafkaListener(DatabaseConduit databaseConduit) {
        this.databaseConduit = databaseConduit;
    }

    @KafkaListener(
            topics  = "${general.kafka-topic}",
            groupId = "midas-consumer-group"
    )
    public void listen(Transaction transaction) {
        log.info("MIDAS_AMOUNT: {}", transaction.getAmount());
        databaseConduit.process(transaction);
    }
}
