package com.kanboo.www.domain.entity.project;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "kanban")
public class Kanban {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kb_idx")
    private Long idx;

    @ManyToOne
    @JoinColumn(name = "prjct_idx")
    private Project project;
}
