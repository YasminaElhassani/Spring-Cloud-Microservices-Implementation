package com.example.orderservice.web;

import com.example.orderservice.repository.OrderRepository;
import com.example.orderservice.repository.ProductItemRepository;
import com.example.orderservice.services.CustomerRestClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderRestController {
    private OrderRepository orderRepository;
    private ProductItemRepository productItemRepository;
    private CustomerRestClient customerRestClient;

}
