package com.example.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerUser {
    private final KafkaTemplate<String, String> kafkaTemplate;
    @Autowired
    public ProducerUser(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    public void send(String topic, String message) {
        kafkaTemplate.send(topic, message);
    }
}
