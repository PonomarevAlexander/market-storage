package ru.ponomarev.marketstorage.application.core.interfaces.persist;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ponomarev.marketstorage.application.core.models.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
