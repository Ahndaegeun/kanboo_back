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
@Table(name = "demand")
public class Demand {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "demand_idx")
    private Long idx;

    @ManyToOne
    @JoinColumn(name = "prjct_idx")
    private Project project;

    @Column(name = "demand_revise_date")
    private LocalDateTime revisionDate;
}
