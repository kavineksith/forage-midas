package com.jpmc.midascore.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import com.jpmc.midascore.foundation.Transaction;

/**
 * Listens on the Kafka topic configured by {@code general.kafka-topic} in
 * {@code application.yml} and deserializes every incoming message into a
 * {@link Transaction}.
 *
 * <p>Design notes:
 * <ul>
 *   <li>The topic name is resolved via Spring's {@code ${...}} EL at startup,
 *       keeping the listener completely decoupled from the value.</li>
 *   <li>The {@code groupId} matches the one declared in
 *       {@link KafkaConsumerConfig} so both share the same consumer group.</li>
 *   <li>No business logic lives here yet — that comes in Task 3.  For now the
 *       listener simply acknowledges receipt by logging the amount, which lets
 *       {@code TaskTwoTests} verify the integration end-to-end.</li>
 * </ul>
 */
@Component
public class TransactionKafkaListener {

    private static final Logger log =
            LoggerFactory.getLogger(TransactionKafkaListener.class);

    @KafkaListener(
            topics  = "${general.kafka-topic}",
            groupId = "midas-consumer-group"
    )
    public void listen(Transaction transaction) {
        log.info("MIDAS_AMOUNT: {}", transaction.getAmount());
    }
}
