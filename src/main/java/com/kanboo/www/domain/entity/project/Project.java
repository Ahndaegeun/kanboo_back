package com.kanboo.www.domain.entity.project;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "project")
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
}
