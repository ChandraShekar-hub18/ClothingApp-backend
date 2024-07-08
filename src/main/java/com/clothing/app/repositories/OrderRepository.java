package com.clothing.app.repositories;

import com.clothing.app.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Integer> {

    public Order findByOrderId(int orderId);
}
