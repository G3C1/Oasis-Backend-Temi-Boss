package com.g3c1.temiboss.domain.category.presentation.dto.request;

import lombok.*;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class CreateCategoryListRequest {
    private final List<String> categoryList;
}
