package com.flairs.spring_docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@ComponentScan(basePackages = { "com.flairs.spring_docker", "com.flairs.controllers" })
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
