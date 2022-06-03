package com.example.lesson15.controller;

import com.example.lesson15.model.Order;
import com.example.lesson15.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class OrderController {
    @Autowired
    private OrderService service;

    @PostMapping("/order")
    public void post(@RequestBody Order order) {
        service.addOrder(order);
    }

    @GetMapping("/orders")
    public List<Order> getAll() {
        return service.getOrders();
    }

    @GetMapping("/order/{id}")
    public List<Order> get(@PathVariable UUID id) {
        return service.getOrder(id);
    }

    @DeleteMapping("/order/{id}")
    public void delete(@PathVariable UUID id) {
        service.deleteOrder(id);
    }
}
