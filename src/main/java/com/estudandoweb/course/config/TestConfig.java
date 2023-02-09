package com.estudandoweb.course.config;

import com.estudandoweb.course.entities.Category;
import com.estudandoweb.course.entities.Order;
import com.estudandoweb.course.entities.User;
import com.estudandoweb.course.entities.enums.OrderStatus;
import com.estudandoweb.course.repositories.CategoryRepository;
import com.estudandoweb.course.repositories.OrderRepository;
import com.estudandoweb.course.repositories.UserRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

//Esta classe popula o banco de teste. Obs.: Foi necessario fazer injeção de dependencia desacoplada

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Eletronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "9888888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "9777777777", "654321");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.DELIVERED, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.CANCELED, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.PAID, u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}