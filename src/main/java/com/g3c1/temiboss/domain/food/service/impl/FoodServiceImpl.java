package com.g3c1.temiboss.domain.food.service.impl;

import com.g3c1.temiboss.domain.category.domain.entity.Category;
import com.g3c1.temiboss.domain.category.utils.CategoryUtils;
import com.g3c1.temiboss.domain.food.domain.entity.Food;
import com.g3c1.temiboss.domain.food.domain.repository.FoodRepository;
import com.g3c1.temiboss.domain.food.presentation.dto.request.AddFoodRequest;
import com.g3c1.temiboss.domain.food.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FoodServiceImpl implements FoodService {
    private final FoodRepository foodRepository;
    private final CategoryUtils categoryUtils;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addFood(List<AddFoodRequest.FoodInfo> foodInfoList) {
        foodRepository.saveAll(foodInfoList.stream().map(foodInfo -> Food.builder()
                .name(foodInfo.getFoodName())
                .img(foodInfo.getFoodImg())
                .price(foodInfo.getPrice())
                .description(foodInfo.getFoodDescription())
                .servings(foodInfo.getServings())
                .category(categoryUtils.findCategoryById(foodInfo.getCategoryId()))
                .build())
                .collect(Collectors.toList()));
    }
}
