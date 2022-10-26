package com.g3c1.temiboss.domain.food.domain.repository;

import com.g3c1.temiboss.domain.food.domain.entity.Food;
import org.springframework.data.repository.CrudRepository;

public interface FoodRepository extends CrudRepository<Food,Long> {
}
