package com.inna.ecommerce;

import com.inna.ecommerce.model.Order;
import com.inna.ecommerce.service.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;

@Component
public class DataLoader implements CommandLineRunner {

    private final OrderService orderService;

    public DataLoader(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void run(String... args) throws Exception {
        Order order1 = new Order(
                new Date(),
                Arrays.asList("Laptop", "Mouse"),
                1200.00,
                "In elaborazione"
        );

        Order order2 = new Order(
                new Date(),
                Arrays.asList("Smartphone", "Cuffie"),
                800.00,
                "Spedito"
        );

        orderService.createOrder(order1);
        orderService.createOrder(order2);

        System.out.println("Ordini di test caricati correttamente ✅");
    }
}
