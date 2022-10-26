package com.g3c1.temiboss.domain.category.exception;

import com.g3c1.temiboss.global.exception.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CategoryNotFoundException extends RuntimeException{
    private final ErrorCode errorCode;

    public CategoryNotFoundException(String message){
        super(message);
        this.errorCode = ErrorCode.CATEGORY_NOT_FOUND;
    }
}
