package com.orderprocessingService.orderprocessing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OrderprocessingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderprocessingApplication.class, args);
	}


}
