package com.demo.workshop_management_api.config;

import com.demo.workshop_management_api.entities.User;
import com.demo.workshop_management_api.repositories.UseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

    @Autowired
    private UseRepository useRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        useRepository.saveAll(Arrays.asList(u1, u2));
    }
}
