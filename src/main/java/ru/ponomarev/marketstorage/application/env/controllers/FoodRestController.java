package ru.ponomarev.marketstorage.application.env.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ponomarev.marketstorage.application.core.models.Food;
import ru.ponomarev.marketstorage.application.core.services.FoodService;

import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping("/api/service/food")
public class FoodRestController {

    private final FoodService service;
    private static final String SPACE = " ";

    @GetMapping("/")
    public String sayHello() {
        return "HELLO";
    }

    @GetMapping("/all")
    public String findAllFoods() {
        return service.findAll().stream()
                .map(this::convertToString)
                .collect(Collectors.joining());
    }

    private String convertToString(Food s) {
        return s.getId() + SPACE + s.getName() + SPACE + s.getManufacturedDate();
    }
}
