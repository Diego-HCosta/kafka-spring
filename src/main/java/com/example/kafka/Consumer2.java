package com.example.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer2 {
    @KafkaListener(topics = "NOVO_USUARIO", groupId = "GRUPO_CLIENTE2")
    public void listen2(String message) {
        System.out.println("Mensagem recebida CONSUMIDOR 2: " + message);
    }
}
