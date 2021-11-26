package com.kanboo.www.dto.project;

import com.kanboo.www.domain.entity.project.Gantt;
import com.kanboo.www.domain.entity.project.Project;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GanttDTO {

    private Long idx;
    private ProjectDTO project;
    private String state;
    private String priority;
    private int progress;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private  String explanation;
    private String title;

    public Gantt dtoToEntity() {
        return Gantt.builder()
                .idx(idx)
                .project(project.dtoToEntity())
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
