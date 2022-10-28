package com.g3c1.temiboss.domain.seat.service.impl;

import com.g3c1.temiboss.domain.seat.domain.entity.Seat;
import com.g3c1.temiboss.domain.seat.presentation.dto.request.AddSeatInfoRequest;
import com.g3c1.temiboss.domain.seat.service.SeatService;
import com.g3c1.temiboss.domain.seat.utils.SeatUtils;
import com.g3c1.temiboss.domain.seat.utils.SeatValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class SeatServiceImpl implements SeatService {
    private final SeatUtils seatUtils;
    private final SeatValidator seatValidator;
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void disableSeat(Long seatId) {
        Seat seatInfo = seatUtils.getSeatInfo(seatId);
        seatValidator.checkSeatIsNotUsed(seatInfo);
        updateSeated(seatInfo,true);
    }

    private void updateSeated(Seat seatInfo,Boolean enabled){
        seatInfo.updateSeated(enabled);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addSeatInfo(AddSeatInfoRequest addSeatRequestList) {
        seatValidator.checkExistSeatNumber(addSeatRequestList.getSeatNumber());
        seatUtils.saveSeatInfo(Seat.builder()
                        .seatNumber(addSeatRequestList.getSeatNumber())
                        .severalPeople(addSeatRequestList.getSeveralPeople())
                        .enabled(true)
                        .build());
    }
}
