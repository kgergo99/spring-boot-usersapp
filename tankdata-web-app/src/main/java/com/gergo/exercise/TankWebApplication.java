package com.gergo.exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class TankWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(TankWebApplication.class, args);
    }
}