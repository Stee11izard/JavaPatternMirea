package com.example.prac14.service;

import com.example.prac14.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {
    private List<Item> items;

    public ItemService() {
        items = new ArrayList<>();
        initialize();
    }

    private void initialize() {
        items.add(new Item("Chair", 2019, 1500));
        items.add(new Item("Table", 2012, 30000));
        items.add(new Item("Sofa", 2015, 30500));
    }

    public void add(Item item) {
        items.add(item);
    }


    public List<Item> getAll() {
        return items;
    }


    public void delete(Item item) {
        items.remove(item);
    }
}
