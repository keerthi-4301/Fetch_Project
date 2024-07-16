package com.Kafka.Project.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.Kafka.Project.model.UserEvent;

@Service
public class KafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "user-login", groupId = "test-group")
    public void consume(UserEvent userEvent) {
        LOGGER.info(String.format("Json message recieved -> %s", userEvent.toString()));
    }
}
