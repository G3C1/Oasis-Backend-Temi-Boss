package com.g3c1.temiboss.domain.food.presentation;

import com.g3c1.temiboss.domain.food.presentation.dto.request.AddFoodRequest;
import com.g3c1.temiboss.domain.food.presentation.dto.response.CategoryFoodResponse;
import com.g3c1.temiboss.domain.food.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("food")
public class FoodController {
    private final FoodService foodService;
    @PostMapping
    public ResponseEntity<Void> foodInfoAdd(@RequestBody AddFoodRequest addFoodRequest){
        foodService.addFood(addFoodRequest.getFoodInfoList());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<CategoryFoodResponse>> categoryFoodInfoList(){
        List<CategoryFoodResponse> categoryFoodInfoList = foodService.getFoodList();
        return new ResponseEntity<>(categoryFoodInfoList,HttpStatus.OK);
    }
}
