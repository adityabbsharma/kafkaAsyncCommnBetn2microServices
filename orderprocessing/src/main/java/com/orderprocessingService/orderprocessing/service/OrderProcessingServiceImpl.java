package com.orderprocessingService.orderprocessing.service;

import com.orderprocessingService.orderprocessing.Model.OrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderProcessingServiceImpl implements IOrderProcessingService{
    @Value("${order-processing-topic}")
    private String orderProcessingTopic;
    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;
    @Override
    public void messageGenerateAfterOrderProcessing(OrderResponse orderResponse) {

        kafkaTemplate.send(orderProcessingTopic,orderResponse.toString());

    }

}
