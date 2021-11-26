package com.kanboo.www.domain.entity.project;

import com.kanboo.www.dto.project.ProjectDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "project")
@Builder
public class Project {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prjct_idx")
    private Long idx;

    @Column(name = "prjct_nm")
    private String name;

    @Column(name = "prjct_start_date")
    private LocalDateTime startDate;

    @Column(name = "prjct_end_date")
    private LocalDateTime endDate;

    @Column(name = "prjct_progress")
    private int progress;

    @Column(name = "prjct_del_at")
    private String isDelete;

    public ProjectDTO entityToDto() {
        return ProjectDTO.builder()
                .idx(idx)
                .name(name)
                .startDate(startDate)
                .endDate(endDate)
                .progress(progress)
                .isDelete(isDelete)
                .build();
    }
}
