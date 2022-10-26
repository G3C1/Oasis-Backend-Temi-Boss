package com.g3c1.temiboss.domain.food.presentation;

import com.g3c1.temiboss.domain.food.presentation.dto.request.AddFoodRequest;
import com.g3c1.temiboss.domain.food.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("food")
public class FoodController {
    private final FoodService foodService;
    @PostMapping
    public ResponseEntity<Void> foodAdd(@RequestBody AddFoodRequest addFoodRequest){
        foodService.addFood(addFoodRequest.getFoodInfoList());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
