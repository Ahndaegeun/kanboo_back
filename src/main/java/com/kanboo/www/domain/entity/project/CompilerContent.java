package com.kanboo.www.domain.entity.project;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "compiler_file")
public class CompilerContent {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "com_file_idx")
    private Long idx;

    @ManyToOne
    @JoinColumn(name = "com_idx")
    private Compiler compiler;

    @Column(name = "com_file_cn")
    private String content;
}
