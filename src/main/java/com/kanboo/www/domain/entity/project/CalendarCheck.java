package com.kanboo.www.domain.entity.project;

import com.kanboo.www.domain.entity.member.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "calendar_check")
public class CalendarCheck {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cal_chk_idx")
    private Long idx;

    @ManyToOne
    @JoinColumn(name = "cal_idx")
    private Calendar calendar;

    @ManyToOne
    @JoinColumn(name = "mem_idx")
    private Member member;
}
