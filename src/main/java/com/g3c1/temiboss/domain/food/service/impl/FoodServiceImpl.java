package com.g3c1.temiboss.domain.food.service.impl;

import com.g3c1.temiboss.domain.category.domain.entity.Category;
import com.g3c1.temiboss.domain.category.utils.CategoryUtils;
import com.g3c1.temiboss.domain.food.domain.entity.Food;
import com.g3c1.temiboss.domain.food.domain.repository.FoodRepository;
import com.g3c1.temiboss.domain.food.presentation.dto.request.AddFoodRequest;
import com.g3c1.temiboss.domain.food.presentation.dto.response.CategoryFoodResponse;
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

    @Override
    public List<CategoryFoodResponse> getFoodList() {
        List<Category> categories = categoryUtils.findAllCategory();
        return getCategoryFoodList(categories);
    }
    private List<CategoryFoodResponse> getCategoryFoodList(List<Category> categories){
        return categories.stream().map(category -> {
            List<CategoryFoodResponse.FoodInfo> foodInfoResponses = getFoodInfoListByCategory(category);
            return CategoryFoodResponse.builder()
                    .id(category.getId())
                    .category(category.getName())
                    .foodList(foodInfoResponses)
                    .build();
        }).collect(Collectors.toList());
    }
    private List<CategoryFoodResponse.FoodInfo> getFoodInfoListByCategory(Category category){
        return foodRepository.findFoodByCategory(category).stream().map(food -> CategoryFoodResponse.FoodInfo.builder()
                .id(food.getId())
                .name(food.getName())
                .img(food.getImg())
                .price(food.getPrice())
                .servings(food.getServings())
                .description(food.getDescription())
                .build()).collect(Collectors.toList());
    }
}
