package com.example.prac14.service;

import com.example.prac14.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    private List<Order> orders;

    public OrderService() {
        orders = new ArrayList<>();
        initialize();
    }

    private void initialize() {
        orders.add(new Order(011222));
        orders.add(new Order(021221));
        orders.add(new Order(121221));
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void deleteOrder(Order order) {
        orders.remove(order);
    }
}
