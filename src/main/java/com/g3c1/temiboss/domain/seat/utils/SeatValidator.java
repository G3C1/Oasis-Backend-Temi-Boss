package com.g3c1.temiboss.domain.seat.utils;

import com.g3c1.temiboss.domain.seat.domain.entity.Seat;
import com.g3c1.temiboss.domain.seat.exception.SeatNotAbleException;

public class SeatValidator {
    public void checkSeatIsNotUsed(Seat seatInfo){
        if(seatInfo.getEnabled()) throw new SeatNotAbleException("사용중이지 않은 좌석입니다.");
    }
}
