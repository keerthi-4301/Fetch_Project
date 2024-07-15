package com.Kafka.Project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Kafka.Project.Service.KafkaProducer;


@RestController
public class KafkaController {
    
    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping("/send")
    public String sendMessage(@RequestParam("message") String message){
        kafkaProducer.sendMessage(message);
        return "Message sent to Kafka topic";
    }
}
