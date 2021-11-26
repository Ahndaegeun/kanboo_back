package com.kanboo.www.dto.project;

import com.kanboo.www.domain.entity.project.Project;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.time.LocalDateTime;

@Data @Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDTO {

    private Long idx;
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int progress;
    private String isDelete;

    public Project dtoToEntity() {
        return Project.builder()
                .idx(idx)
                .name(name)
                .startDate(startDate)
                .endDate(endDate)
                .progress(progress)
                .isDelete(isDelete)
                .build();
    }
}
