package com.g3c1.temiboss.domain.category.service.impl;

import com.g3c1.temiboss.domain.category.domain.entity.Category;
import com.g3c1.temiboss.domain.category.domain.repository.CategoryRepository;
import com.g3c1.temiboss.domain.category.presentation.dto.request.CreateCategoryListRequest;
import com.g3c1.temiboss.domain.category.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addCategory(CreateCategoryListRequest createCategoryRequest) {
       categoryRepository.saveAll(createCategoryRequest.getCategoryList().stream().map(category-> Category.builder()
               .name(category)
               .build())
               .collect(Collectors.toList()));
    }
}
