package com.g3c1.temiboss.domain.seat.utils;

import com.g3c1.temiboss.domain.seat.domain.entity.Seat;
import com.g3c1.temiboss.domain.seat.domain.repository.SeatRepository;
import com.g3c1.temiboss.domain.seat.exception.SeatNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SeatUtils {
    private final SeatRepository seatRepository;

    public Seat getSeatInfo(Long seatId){
        return seatRepository.findSeatById(seatId).orElseThrow(()-> new SeatNotFoundException("좌석을 찾을 수 없습니다."));
    }
    public void saveSeatInfo(Seat seatList){
        seatRepository.save(seatList);
    }
}
