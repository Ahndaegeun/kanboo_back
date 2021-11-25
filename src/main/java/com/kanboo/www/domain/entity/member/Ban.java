package com.kanboo.www.domain.entity.member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ban")
public class Ban {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ban_idx")
    private Long idx;

    @ManyToOne
    @JoinColumn(name = "mem_idx")
    private Member member;

    @Column(name = "ban_start_date")
    private LocalDateTime startDate;

    @Column(name = "ban_end_date")
    private LocalDateTime endDate;

}
