package com.Kafka.Project.Service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.Kafka.Project.model.UserEvent;

@Service
public class KafkaProducer {
    private static final String TOPIC = "user-login";

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

    private KafkaTemplate<String, UserEvent> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String,UserEvent> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(UserEvent userEvent){
        LOGGER.info(String.format("Producing message: %s", userEvent.toString()));

        Message<UserEvent> message = MessageBuilder
                .withPayload(userEvent)
                .setHeader(KafkaHeaders.TOPIC, TOPIC)
                .build();

        kafkaTemplate.send(message);
    }
}
