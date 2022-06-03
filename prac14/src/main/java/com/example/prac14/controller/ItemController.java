package com.example.prac14.controller;

import com.example.prac14.Item;
import com.example.prac14.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    private ItemService service;

    @PostMapping("/postItems")
    public void post(@RequestBody Item item) {
        service.add(item);
    }

    @GetMapping("/getItems")
    public List<Item> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/deleteItem")
    public void delete(@RequestBody Item item) {
        service.delete(item);
    }
}
