package com.g3c1.temiboss.domain.seat.service;

import com.g3c1.temiboss.domain.seat.presentation.dto.request.AddSeatInfoRequest;

public interface SeatService {
    void disableSeat(Long seatId);
    void addSeatInfo(AddSeatInfoRequest addSeatRequestList);
}
