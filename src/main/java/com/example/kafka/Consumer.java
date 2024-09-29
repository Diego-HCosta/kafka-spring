package com.example.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @KafkaListener(topics = "NOVO_USUARIO", groupId = "GRUPO_CLIENTE")
    public void listen1(String message) {
        System.out.println("Mensagem recebida CONSUMIDOR 1: " + message);
    }
}
