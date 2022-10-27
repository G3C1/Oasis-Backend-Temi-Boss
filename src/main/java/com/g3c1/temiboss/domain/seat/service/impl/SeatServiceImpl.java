package com.g3c1.temiboss.domain.seat.service.impl;

import com.g3c1.temiboss.domain.seat.domain.entity.Seat;
import com.g3c1.temiboss.domain.seat.service.SeatService;
import com.g3c1.temiboss.domain.seat.utils.SeatUtils;
import com.g3c1.temiboss.domain.seat.utils.SeatValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SeatServiceImpl implements SeatService {
    private final SeatUtils seatUtils;
    private final SeatValidator seatValidator;
    @Override
    public void disableSeat(Long seatId) {
        Seat seatInfo = seatUtils.getSeatInfo(seatId);
        seatValidator.checkSeatIsNotUsed(seatInfo);
        updateSeated(seatInfo,true);
    }
    private void updateSeated(Seat seatInfo,Boolean enabled){
        seatInfo.updateSeated(enabled);
    }
}
