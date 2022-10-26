package com.g3c1.temiboss.domain.purchase.domain.entity;

import com.g3c1.temiboss.domain.food.domain.entity.Food;
import com.g3c1.temiboss.domain.seat.domain.entity.Seat;
import com.g3c1.temiboss.global.entity.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter @Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Purchase extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne()
    private Food food;
    @ManyToOne()
    private Seat seat;
    private Long foodCount;
}
