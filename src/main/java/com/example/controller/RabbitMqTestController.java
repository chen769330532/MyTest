package com.example.controller;

import com.example.pojo.OrderTest;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbitMq")
public class RabbitMqTestController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/createOrder")
    public Long createOrder(@RequestBody OrderTest order){
        return orderService.createOrder(order);
    }

    @PostMapping("/payOrder")
    public Boolean createOrder(@RequestBody Long orderId){
        return orderService.payOrder(orderId);
    }
}
