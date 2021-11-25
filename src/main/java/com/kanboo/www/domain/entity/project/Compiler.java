package com.kanboo.www.domain.entity.project;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "compiler")
public class Compiler {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "com_idx")
    private Long idx;

    @ManyToOne
    @JoinColumn(name = "prjct_idx")
    private Project project;

    @OneToOne
    @JoinColumn(name = "com_idx")
    private Compiler compiler;

    @Column(name = "com_se")
    private String classification;

    @Column(name = "com_nm")
    private String name;
}
