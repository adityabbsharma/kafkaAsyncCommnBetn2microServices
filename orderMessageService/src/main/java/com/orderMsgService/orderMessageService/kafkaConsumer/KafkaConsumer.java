package com.orderMsgService.orderMessageService.kafkaConsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class KafkaConsumer {
    @KafkaListener(topics = "${order-processing-topic}",groupId = "group_id")
    private void orderProcessingListener(String message){
        System.out.println("Received order message from order processing service= "+message);
    }
}
