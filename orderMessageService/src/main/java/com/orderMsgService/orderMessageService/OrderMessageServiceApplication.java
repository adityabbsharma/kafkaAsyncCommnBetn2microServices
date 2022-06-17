package com.orderMsgService.orderMessageService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.Message;

@SpringBootApplication
public class OrderMessageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderMessageServiceApplication.class, args);
	}



}
