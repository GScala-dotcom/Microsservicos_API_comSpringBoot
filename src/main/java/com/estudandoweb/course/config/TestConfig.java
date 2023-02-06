package com.estudandoweb.course.config;
import com.estudandoweb.course.entities.User;
import com.estudandoweb.course.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

//Esta classe popula o banco de teste. Obs.: Foi necessario fazer injeção de dependencia desacoplada

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "9888888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "9777777777", "654321");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
