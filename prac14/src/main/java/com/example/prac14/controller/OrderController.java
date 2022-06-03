package com.example.prac14.controller;

import com.example.prac14.Order;
import com.example.prac14.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService service;

    @PostMapping("/postOrder")
    public void postManufacture(@RequestBody Order order) {
        service.addOrder(order);
    }

    @GetMapping("/getOrders")
    public List<Order> getAll() {
        return service.getOrders();
    }

    @DeleteMapping("/deleteOrder")
    public void deleteManufacture(@RequestBody Order order) {
        service.deleteOrder(order);
    }
}
