package com.example.orderservice.web;

import com.example.orderservice.entities.Order;
import com.example.orderservice.model.Customer;
import com.example.orderservice.model.Product;
import com.example.orderservice.repository.OrderRepository;
import com.example.orderservice.repository.ProductItemRepository;
import com.example.orderservice.services.CustomerRestClient;
import com.example.orderservice.services.InventoryRestClient;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController @AllArgsConstructor
public class OrderRestController {
    private OrderRepository orderRepository;
    private ProductItemRepository productItemRepository;
    private CustomerRestClient customerRestClient;
    public InventoryRestClient inventoryRestClient;

    @GetMapping("/fullOrder/{id}")
    public Order getOrder(@PathVariable Long id){
        Order order=orderRepository.findById(id).get();
        Customer customer=customerRestClient.customerById(order.getCustomerId());
        order.setCustomer(customer);
        order.getProductItems().forEach(pi->{
            Product product=inventoryRestClient.productById(pi.getProductId());
            pi.setProduct(product);
        });
        return order;
    }

}
