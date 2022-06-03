package com.example.prac14;

import java.util.Objects;

public class Order {
    private int orderDate;

    public Order() {
    }

    public Order(int orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(int orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(orderDate, order.orderDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderDate);
    }
}
