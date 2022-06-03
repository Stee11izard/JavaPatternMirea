package com.example.lesson15;

import com.example.lesson16.model.Item;
import com.example.lesson16.model.Order;
import com.example.lesson16.repository.ItemRepository;
import com.example.lesson16.repository.OrderRepository;
import com.example.lesson16.service.ItemService;
import com.example.lesson16.service.OrderService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class ServiceTest {

    ItemService itemService;

    OrderService orderService;

    @MockBean
    private ItemRepository itemRepo;

    @MockBean
    private OrderRepository orderRepo;

    @Test
    void getUsers() {
        Item item1 = new Item();
        item1.setName("Spam");
        Item item2 = new Item();
        item2.setName("Eggs");

        List<Item> expected = itemService.getItems();

        Mockito.verify(itemRepo).findAll();
        Assertions.assertEquals(expected.size(), 2);
        Assertions.assertEquals(expected.get(0).getName(), "Eggs");
    }

    @Test
    void getPosts() {
        Order order = new Order();
        order.setOrderDate(12);

        List<Order> expected = orderService.getOrders();

        Mockito.verify(orderRepo).findAll();
        Assertions.assertEquals(expected.size(), 1);
        Assertions.assertEquals(expected.get(0).getOrderDate(), 12);
    }

}