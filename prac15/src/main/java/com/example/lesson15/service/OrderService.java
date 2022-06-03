package com.example.lesson15.service;

import com.example.lesson15.model.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.UUID;

@Service
public class OrderService {

    @Autowired
    private final SessionFactory sessionFactory;

    public OrderService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session session;

    @PostConstruct
    public void init() {
        session = sessionFactory.openSession();
    }

    @PreDestroy
    public void unSession() {
        session.close();
    }

    public void addOrder(Order order) {
        session.beginTransaction();
        session.saveOrUpdate(order);
        session.getTransaction().commit();
    }

    public List<Order> getOrders() {
        return session.createQuery("select mn from Order mn", Order.class).list();
    }

    public List<Order> getOrder(UUID id) {
        return session.createQuery("select mn from Order mn where mn.id ='" + id + "'", Order.class).list();
    }

    public void deleteOrder(Order order) {
        session.beginTransaction();

        List<Order> query = session.createQuery("select mn from Order mn where mn.orderDate = '" + order.getOrderDate() + "'", Order.class).list();
        for (Order mn : query) {
            session.delete(mn);
        }

        session.getTransaction().commit();
    }

    public void deleteOrder(UUID id) {
        session.beginTransaction();

        Order temp = session.load(Order.class, id);
        session.delete(temp);

        session.getTransaction().commit();
    }
}
