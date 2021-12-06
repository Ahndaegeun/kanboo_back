package com.kanboo.www.domain.entity.project;

import com.kanboo.www.domain.entity.member.Member;
import com.kanboo.www.dto.project.CalendarDTO;
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
@Table(name = "calendar")
@Builder
public class Calendar {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long calIdx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prjct_idx")
    private Project project;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mem_idx")
    private Member member;

    private LocalDateTime calStartDate;
    private LocalDateTime calEndDate;
    private String calColor;
    private String calSe;
    private String calCn;
    private String calTitle;
    private String calDelAt;
    private String calDelResn;

    public CalendarDTO entityToDto() {
        return CalendarDTO.builder()
                .calIdx(calIdx)
                .project(project.entityToDto())
                .member(member.entityToDto())
                .calStartDate(calStartDate)
                .calEndDate(calEndDate)
                .calColor(calColor)
                .calSe(calSe)
                .calCn(calCn)
                .calTitle(calTitle)
                .calDelAt(calDelAt)
                .calDelResn(calDelResn)
                .build();
    }
}
