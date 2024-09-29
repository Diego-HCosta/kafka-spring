package com.example.kafka.controller;

import com.example.kafka.Consumer;
import com.example.kafka.ProducerUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    private final ProducerUser kafkaProducer;

    @Autowired
    public KafkaController(ProducerUser kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/send")
    public void sendMessage(@RequestBody String message) {
        System.out.println("Enviando Mensagem...");
        try {
            kafkaProducer.send("NOVO_USUARIO", message);
            System.out.println("Mensagem Enviada !");
        }catch (Exception e) {
            System.out.println("error "+e.getMessage());;
            System.out.println("message "+message);;
        }

    }
}
