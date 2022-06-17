package com.orderprocessingService.orderprocessing.controller;

import com.orderprocessingService.orderprocessing.Model.OrderResponse;
import com.orderprocessingService.orderprocessing.service.IOrderProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class OrderProcessingController {
    @Autowired
    private IOrderProcessingService orderProcessingService;

    @PostMapping(value = "/order/{orderId}",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> processOrder(@PathVariable String orderId){
        OrderResponse orderResponse = new OrderResponse(orderId,"Order Processed");
        orderProcessingService.messageGenerateAfterOrderProcessing(orderResponse);
        return new ResponseEntity<>("Order Processed and Message also processed to messaging service", HttpStatus.OK);
    }



}
