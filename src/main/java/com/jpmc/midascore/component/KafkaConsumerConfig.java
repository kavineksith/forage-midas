package com.jpmc.midascore.component;

import com.jpmc.midascore.foundation.Transaction;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import java.util.HashMap;
import java.util.Map;

/**
 * Configures the Kafka consumer used by {@link TransactionKafkaListener}.
 *
 * <p>Key decisions:
 * <ul>
 *   <li><b>No bootstrap-servers</b> — the embedded Kafka broker injected by the
 *       test framework overwrites this at test-startup time via Spring's
 *       {@code @EmbeddedKafka} property source, so we never need to hard-code
 *       a host or port here.</li>
 *   <li><b>JsonDeserializer(Transaction.class, false)</b> — the {@code false}
 *       flag disables type-header enforcement, which is required when messages
 *       are produced without Spring's {@code __TypeId__} header (as the test
 *       producer does).</li>
 *   <li><b>earliest auto-offset-reset</b> — ensures the consumer reads from
 *       the beginning of the topic so no test messages are missed.</li>
 * </ul>
 */
@Configuration
public class KafkaConsumerConfig {

    @Bean
    public ConsumerFactory<String, Transaction> consumerFactory() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.GROUP_ID_CONFIG,          "midas-consumer-group");
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

        JsonDeserializer<Transaction> deserializer =
                new JsonDeserializer<>(Transaction.class, false);

        return new DefaultKafkaConsumerFactory<>(
                props,
                new StringDeserializer(),
                deserializer
        );
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, Transaction>
    kafkaListenerContainerFactory() {

        ConcurrentKafkaListenerContainerFactory<String, Transaction> factory =
                new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        return factory;
    }
}
