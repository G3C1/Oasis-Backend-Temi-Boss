package com.g3c1.temiboss.domain.category.service;

import com.g3c1.temiboss.domain.category.presentation.dto.request.CreateCategoryListRequest;

public interface CategoryService {
    void addCategory(CreateCategoryListRequest createCategoryRequest);
}
