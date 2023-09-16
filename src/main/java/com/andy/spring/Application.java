package com.andy.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        System.out.println("Start");
        SpringApplication.run(Application.class, args);
        System.out.println("Done");
    }

}