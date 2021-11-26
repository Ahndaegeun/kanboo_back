package com.kanboo.www.domain.entity.project;

import com.kanboo.www.dto.project.GanttDTO;
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
@Table(name = "gantt")
@Builder
public class Gantt {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gt_idx")
    private Long idx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prjct_idx")
    private Project project;

    @Column(name = "gt_state")
    private String state;

    @Column(name = "gt_priority")
    private String priority;

    @Column(name = "gt_progress")
    private int progress;

    @Column(name = "gt_start_date")
    private LocalDateTime startDate;

    @Column(name = "gt_end_date")
    private LocalDateTime endDate;

    @Column(name = "gt_explanation")
    private  String explanation;

    @Column(name = "gt_title")
    private String title;

    public GanttDTO entityToDto() {
        return GanttDTO.builder()
                .idx(idx)
                .project(project.entityToDto())
                .state(state)
                .priority(priority)
                .progress(progress)
                .startDate(startDate)
                .endDate(endDate)
                .explanation(explanation)
                .title(title)
                .build();
    }
}
