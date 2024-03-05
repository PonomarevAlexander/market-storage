package ru.ponomarev.marketstorage.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import ru.ponomarev.marketstorage.application.env.controllers.FoodRestController;

@SpringBootApplication
public class MarketStorageApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketStorageApplication.class, args);
    }

}
