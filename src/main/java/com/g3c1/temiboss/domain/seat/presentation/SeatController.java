package com.g3c1.temiboss.domain.seat.presentation;

import com.g3c1.temiboss.domain.seat.presentation.dto.request.AddSeatInfoRequest;
import com.g3c1.temiboss.domain.seat.service.SeatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("seat")
public class SeatController {
    private final SeatService seatService;
    @PatchMapping("/cancel/{seatId}")
    public ResponseEntity<Void> disableSeat(@PathVariable("seatId")Long seatId){
        seatService.disableSeat(seatId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PostMapping
    public ResponseEntity<Void> addSeatInfo(@RequestBody AddSeatInfoRequest addSeatRequest){
        seatService.addSeatInfo(addSeatRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
