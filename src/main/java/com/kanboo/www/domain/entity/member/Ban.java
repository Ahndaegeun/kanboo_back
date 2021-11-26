package com.kanboo.www.domain.entity.member;

import com.kanboo.www.dto.member.BanDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ban")
@Builder
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

    public BanDTO entityToDto() {
        return BanDTO.builder()
                .idx(idx)
                .member(member.entityToDto())
                .startDate(startDate)
                .endDate(endDate)
                .build();
    }
}
