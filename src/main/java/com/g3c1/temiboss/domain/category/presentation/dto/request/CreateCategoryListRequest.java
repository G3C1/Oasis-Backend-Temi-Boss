package com.g3c1.temiboss.domain.category.presentation.dto.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
public class CreateCategoryListRequest {
    private List<String> categoryList;

    @JsonCreator
    public CreateCategoryListRequest(@JsonProperty("categoryList")List<String> categoryList){
        this.categoryList = categoryList;
    }
}
