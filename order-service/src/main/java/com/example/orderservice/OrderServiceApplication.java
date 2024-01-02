package com.example.orderservice;

import com.example.orderservice.repository.OrderRepository;
import com.example.orderservice.repository.ProductItemRepository;
import com.example.orderservice.services.CustomerRestClient;
import com.example.orderservice.services.InventoryRestClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(OrderRepository orderRepository,
							ProductItemRepository productItemRepository,
							CustomerRestClient customerRestClient,
							InventoryRestClient inventoryRestClient){

	}


}
