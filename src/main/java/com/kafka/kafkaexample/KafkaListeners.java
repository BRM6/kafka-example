package com.kafka.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "dima", groupId = "id")
    void listener(String data){
        System.out.println("received: " + data + ":)");
    }
}
