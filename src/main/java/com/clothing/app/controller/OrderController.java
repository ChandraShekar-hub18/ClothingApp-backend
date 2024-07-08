package com.clothing.app.controller;

import com.clothing.app.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    public static OrderService orderService;

    public OrderController() {}

    @GetMapping("/order")
    public String getOrder(){
        return "Order";
    }

    @GetMapping("/order/:id")
    public String getOrderById(@RequestParam int id) {
        return orderService.getOrderById(id).toString();
    }

}
