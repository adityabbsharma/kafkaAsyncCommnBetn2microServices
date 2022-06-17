package com.orderprocessingService.orderprocessing.service;

import com.orderprocessingService.orderprocessing.Model.OrderResponse;
import org.springframework.stereotype.Service;


public interface IOrderProcessingService {
    public void messageGenerateAfterOrderProcessing(OrderResponse orderResponse);
}
