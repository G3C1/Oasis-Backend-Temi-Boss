package com.g3c1.temiboss.domain.seat.utils;

import com.g3c1.temiboss.domain.seat.domain.entity.Seat;
import com.g3c1.temiboss.domain.seat.domain.repository.SeatRepository;
import com.g3c1.temiboss.domain.seat.exception.SeatNotAbleException;
import com.g3c1.temiboss.domain.seat.exception.SeatNumberAlreadyExistException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SeatValidator {
    private final SeatRepository seatRepository;
    public void checkSeatIsNotUsed(Seat seatInfo){
        if(seatInfo.getEnabled()) throw new SeatNotAbleException("사용중이지 않은 좌석입니다.");
    }
    public void checkExistSeatNumber(int seatNumber){
        if(seatRepository.existsBySeatNumber(seatNumber)) throw new SeatNumberAlreadyExistException("좌석번호가 이미 존재합니다.");
    }
}
