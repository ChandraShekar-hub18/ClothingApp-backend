package com.clothing.app.services;

import com.clothing.app.entities.Order;
import com.clothing.app.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    public static  OrderRepository orderRepository;

    public OrderService() {}

    public Order getOrderById(int id){
        Order order = orderRepository.findByOrderId(id);
        return order;
    }
}
