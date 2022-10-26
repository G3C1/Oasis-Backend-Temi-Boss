package com.g3c1.temiboss.domain.seat.exception;

import com.g3c1.temiboss.global.exception.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class SeatNotFoundException extends RuntimeException{
    private final ErrorCode errorCode;

    public SeatNotFoundException(String message){
        super(message);
        this.errorCode = ErrorCode.SEAT_NOT_FOUND;
    }
}
