package com.kanboo.www.domain.entity.project;

import com.kanboo.www.dto.project.CompilerDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "compiler")
@Builder
public class Compiler {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "com_idx")
    private Long idx;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prjct_idx")
    private Project project;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "com_idx")
    private Compiler compiler;

    @Column(name = "com_se")
    private String classification;

    @Column(name = "com_nm")
    private String name;

    public CompilerDTO entityToDto() {
        return CompilerDTO.builder()
                .idx(idx)
                .project(project.entityToDto())
                .compiler(compiler.entityToDto())
                .classification(classification)
                .name(name)
                .build();
    }
}
