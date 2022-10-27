package com.g3c1.temiboss.global.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    SEAT_NOT_ABLE("사용중이지 않은 좌석입니다.",400),
    CATEGORY_NOT_FOUND("카테고리를 찾을 수 없습니다.",404),
    SEAT_NOT_FOUND("좌석을 찾을 수 없습니다.",404),
    UNKNOWN("알수없는 에러",500);
    private final String message;
    private final int status;
}
