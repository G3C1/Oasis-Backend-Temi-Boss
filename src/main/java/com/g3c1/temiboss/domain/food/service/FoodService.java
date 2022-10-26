package com.g3c1.temiboss.domain.food.service;

import com.g3c1.temiboss.domain.food.presentation.dto.request.AddFoodRequest;

import java.util.List;

public interface FoodService {
    void addFood(List<AddFoodRequest.FoodInfo> foodInfoList);

}
