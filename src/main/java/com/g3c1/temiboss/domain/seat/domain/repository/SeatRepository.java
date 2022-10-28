package com.g3c1.temiboss.domain.seat.domain.repository;

import com.g3c1.temiboss.domain.seat.domain.entity.Seat;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface SeatRepository extends CrudRepository<Seat,Long> {
    Optional<Seat> findSeatById(Long SeatId);
    Boolean existsBySeatNumber(int seatNumber);
}
