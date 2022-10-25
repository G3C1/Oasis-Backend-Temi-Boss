package com.g3c1.temiboss.domain.category.presentation.dto.request;

import lombok.*;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateCategoryListRequest {
    private List<String> categoryList;


}
