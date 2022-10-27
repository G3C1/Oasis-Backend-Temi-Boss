package com.g3c1.temiboss.domain.category.utils;

import com.g3c1.temiboss.domain.category.domain.entity.Category;
import com.g3c1.temiboss.domain.category.domain.repository.CategoryRepository;
import com.g3c1.temiboss.domain.category.exception.CategoryNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryUtils {
    private final CategoryRepository categoryRepository;

    public Category findCategoryById(Long categoryId){
        return categoryRepository.findCategoryById(categoryId).orElseThrow(()->new CategoryNotFoundException("카테고리를 찾을 수 없습니다."));
    }
    public List<Category> findAllCategory(){
        return categoryRepository.findAll();
    }
}
