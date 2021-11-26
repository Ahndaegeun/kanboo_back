package com.kanboo.www.dto.project;

import com.kanboo.www.domain.entity.project.Demand;
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
public class DemandDTO {

    private Long idx;
    private ProjectDTO project;
    private LocalDateTime revisionDate;

    public Demand dtoToEntity() {
        return Demand.builder()
                .idx(idx)
                .project(project.dtoToEntity())
                .revisionDate(revisionDate)
                .build();
    }

}
