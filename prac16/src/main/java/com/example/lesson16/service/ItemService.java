package com.example.lesson16.service;

import com.example.lesson16.model.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.UUID;

@Service
public class ItemService {

    @Autowired
    private final SessionFactory sessionFactory;

    public ItemService(SessionFactory sessionFactory) {
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

    public void addItem(Item item) {
        session.beginTransaction();
        session.saveOrUpdate(item);
        session.getTransaction().commit();
    }

    public List<Item> getItems() {
        return session.createQuery("select p from Item p", Item.class).list();
    }

    public Item getItem(UUID id) {
        return session.createQuery("select p from Item p where p.id = '" + id + "'", Item.class).getSingleResult();
    }

    public void deleteItem(UUID id) {

        session.beginTransaction();

        Item temp = session.load(Item.class, id);
        session.delete(temp);

        session.getTransaction().commit();
    }
}
