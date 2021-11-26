package com.kanboo.www.dto.project;

import com.kanboo.www.domain.entity.project.Compiler;
import com.kanboo.www.domain.entity.project.CompilerContent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompilerContentDTO {

    private Long idx;
    private CompilerDTO compiler;
    private String content;

    public CompilerContent dtoToEntity() {
        return CompilerContent.builder()
                .idx(idx)
                .compiler(compiler.dtoToEntity())
                .content(content)
                .build();
    }
}
