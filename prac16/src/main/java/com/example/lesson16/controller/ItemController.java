package com.example.lesson16.controller;

import com.example.lesson16.model.Item;
import com.example.lesson16.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class ItemController {
    @Autowired
    private ItemService service;

    @PostMapping("/item")
    public void post(@RequestBody Item item) {
        service.addItem(item);
    }

    @GetMapping("/items")
    public List<Item> getAll() {
        return service.getItems();
    }

    @GetMapping("/item/{id}")
    public Item get(@PathVariable UUID id) {
        return service.getItem(id);
    }

    @DeleteMapping("/item/{id}")
    public void delete(@PathVariable UUID id) {
        service.deleteItem(id);
    }
}
