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
    @Column(name = "cal_idx")
    private Long idx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prjct_idx")
    private Project project;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mem_idx")
    private Member member;

    @Column(name = "cal_start_date")
    private LocalDateTime startDate;

    @Column(name = "cal_end_date")
    private LocalDateTime endDate;

    @Column(name = "cal_color")
    private String color;

    @Column(name = "cal_se")
    private String classification;

    @Column(name = "cal_cn")
    private String content;

    @Column(name = "cal_title")
    private String title;

    @Column(name = "cal_del_at")
    private String isDelete;

    @Column(name = "cal_del_resn")
    private String reasonOfDelete;

    public CalendarDTO entityToDto() {
        return CalendarDTO.builder()
                .idx(idx)
                .project(project.entityToDto())
                .member(member.entityToDto())
                .startDate(startDate)
                .endDate(endDate)
                .color(color)
                .classification(classification)
                .content(content)
                .title(title)
                .isDelete(isDelete)
                .reasonOfDelete(reasonOfDelete)
                .build();
    }
}
