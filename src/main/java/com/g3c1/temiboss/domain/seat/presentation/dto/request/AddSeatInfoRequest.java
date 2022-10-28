package com.g3c1.temiboss.domain.seat.presentation.dto.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
public class AddSeatInfoRequest {
    private final int seatNumber;
    private final int severalPeople;
}
