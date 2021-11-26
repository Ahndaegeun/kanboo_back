package com.kanboo.www.dto.project;

import com.kanboo.www.domain.entity.project.Compiler;
import com.kanboo.www.domain.entity.project.Project;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompilerDTO {

    private Long idx;
    private ProjectDTO project;
    private CompilerDTO compiler;
    private String classification;
    private String name;

    public Compiler dtoToEntity() {
        return Compiler.builder()
                .idx(idx)
                .project(project.dtoToEntity())
                .compiler(compiler.dtoToEntity())
                .classification(classification)
                .name(name)
                .build();
    }
}
