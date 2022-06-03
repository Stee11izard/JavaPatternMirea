package com.example.lesson16.service;

import com.example.lesson16.model.Item;
import com.example.lesson16.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@Service
public class SchedulerServiceImpl {

    @Autowired
    com.example.lesson16.service.ItemServiceImplementation itemService;
    com.example.lesson16.service.OrderServiceImplementation orderService;


    @Scheduled(cron = "0 0/30 * * * *")
    public void doScheduledTask() {
        File folder = new File("../../ScheduledFiles");
        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                f.delete();
            }
        }

        File itemFile = new File("../../ScheduledFiles/item.txt");
        if(!itemFile.exists()){
            try {
                itemFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File orderFile = new File("../../ScheduledFiles/order.txt");
        if(!orderFile.exists()){
            try {
                orderFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileWriter itemWriter;

        try {
            itemWriter = new FileWriter(itemFile.getAbsolutePath(), false);
            List<Item> items = itemService.getItems();
            for (Item u : items) {
                itemWriter.append(u.toString());
                itemWriter.append("\n");
            }
            itemWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileWriter orderWriter;

        try {
            orderWriter = new FileWriter(orderFile.getAbsolutePath(), false);
            List<Order> orders = orderService.getOrders();
            for (Order u : orders) {
                orderWriter.append(u.toString());
                orderWriter.append("\n");
            }
            orderWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}