package com.g3c1.temiboss.domain.category.presentation;

import com.g3c1.temiboss.domain.category.presentation.dto.request.CreateCategoryListRequest;
import com.g3c1.temiboss.domain.category.service.AddCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("category")
public class CategoryController {
    private final AddCategoryService addCategoryService;

    @PostMapping
    public ResponseEntity<Void> PostCategory(@RequestBody CreateCategoryListRequest createCategoryRequest){
        addCategoryService.execute(createCategoryRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
