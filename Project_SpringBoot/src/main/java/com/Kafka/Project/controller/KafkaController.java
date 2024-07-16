package com.Kafka.Project.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Kafka.Project.Service.KafkaProducer;
import com.Kafka.Project.model.UserEvent;


@RestController
public class KafkaController {
    
    private KafkaProducer kafkaProducer;

    public KafkaController(KafkaProducer kafkaProducer){
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/send")
    public String sendMessage(@RequestBody UserEvent userEvent){
        kafkaProducer.sendMessage(userEvent);
        return "Message sent to Kafka topic";
    }
}
