package com.jpmc.midascore.component;

import com.jpmc.midascore.foundation.Transaction;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
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
 *   <li><b>bootstrap-servers from property</b> — read from {@code spring.kafka.bootstrap-servers},
 *       which Spring Boot auto-populates for the main app AND which {@code @EmbeddedKafka}
 *       overrides at test startup. This is the critical fix: without this property in the
 *       props map the consumer cannot resolve any broker and throws
 *       {@code ConfigException: No resolvable bootstrap urls}.</li>
 *   <li><b>JsonDeserializer(Transaction.class, false)</b> — the {@code false} flag disables
 *       type-header enforcement, required when messages are produced without Spring's
 *       {@code __TypeId__} header (as the test producer does).</li>
 *   <li><b>earliest auto-offset-reset</b> — ensures the consumer reads from the beginning
 *       of the topic so no test messages are missed.</li>
 * </ul>
 */
@Configuration
public class KafkaConsumerConfig {

    /**
     * Injected from {@code spring.kafka.bootstrap-servers}.
     *
     * In tests, {@code @EmbeddedKafka} sets this property to the embedded broker's
     * address (e.g. {@code localhost:9092}) before the application context starts,
     * so this value is always correct — both in production and in tests.
     */
    @Value("${spring.kafka.bootstrap-servers}")
    private String bootstrapServers;

    @Bean
    public ConsumerFactory<String, Transaction> consumerFactory() {
        Map<String, Object> props = new HashMap<>();

        // THIS is the line that was missing — without it the consumer has no broker to connect to
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,  bootstrapServers);
        props.put(ConsumerConfig.GROUP_ID_CONFIG,           "midas-consumer-group");
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG,  "earliest");

        // false = do not enforce type-header validation (required for test compatibility)
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