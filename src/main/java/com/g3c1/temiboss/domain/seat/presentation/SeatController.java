package com.g3c1.temiboss.domain.seat.presentation;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("food")
public class SeatController {
    @PatchMapping("/cancel/{seatId}")
    public ResponseEntity<Void> disableSeat(@PathVariable("seatId")Long seatId){

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
