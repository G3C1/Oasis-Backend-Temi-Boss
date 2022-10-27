package com.g3c1.temiboss.domain.food.domain.repository;

import com.g3c1.temiboss.domain.category.domain.entity.Category;
import com.g3c1.temiboss.domain.food.domain.entity.Food;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FoodRepository extends CrudRepository<Food,Long> {
    List<Food> findFoodByCategory(Category category);
}
