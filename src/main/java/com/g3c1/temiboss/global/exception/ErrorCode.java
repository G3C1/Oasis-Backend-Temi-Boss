package com.g3c1.temiboss.global.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    CATEGORY_NOT_FOUND("카테고리를 찾을 수 없습니다.",404),
    UNKNOWN("알수없는 에러",500);
    private final String message;
    private final int status;
}
