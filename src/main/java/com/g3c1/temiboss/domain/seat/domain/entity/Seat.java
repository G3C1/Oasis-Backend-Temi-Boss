package com.g3c1.temiboss.domain.seat.domain.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "seat_number")
    private int seatNumber;
    @Column(name = "several_people")
    private int severalPeople;
    private Boolean enabled;

    public void updateSeated(Boolean enable) {
        enabled = enable;
    }
}
