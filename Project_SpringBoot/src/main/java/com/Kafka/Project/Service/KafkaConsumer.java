package com.Kafka.Project.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "user-login", groupId = "test-group")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }
}
