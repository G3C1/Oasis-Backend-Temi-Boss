package com.g3c1.temiboss.domain.food.presentation.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class AddFoodRequest {
    List<FoodInfo> foodInfoList;

    @Getter @Setter
    @AllArgsConstructor
    public static class FoodInfo {
        private final String foodName;
        private final String foodImg;
        private final String foodDescription;
        private final int servings;
        private final Long price;
        private final Long categoryId;
    }
}
