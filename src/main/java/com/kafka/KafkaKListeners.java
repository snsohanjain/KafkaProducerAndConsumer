package com.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaKListeners {

    @KafkaListener(
            topics = "sohanjain",
            groupId = "groupId"
    )
    void listener(String data){
        System.out.println("Listener Received " + data + " " + ":) " + "🥳" + " 🎉")  ;
    }


}
