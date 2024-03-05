package ru.ponomarev.marketstorage.application.core.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ponomarev.marketstorage.application.core.interfaces.persist.FoodRepository;
import ru.ponomarev.marketstorage.application.core.models.Food;

import java.util.List;

@Service
@AllArgsConstructor
public class FoodService {

    private final FoodRepository foodRepository;

    public List<Food> findAll() {
        return foodRepository.findAll();
    }
}
