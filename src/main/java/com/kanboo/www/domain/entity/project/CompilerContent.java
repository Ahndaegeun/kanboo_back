package com.kanboo.www.domain.entity.project;

import com.kanboo.www.dto.project.CompilerContentDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "compiler_file")
@Builder
public class CompilerContent {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "com_file_idx")
    private Long idx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "com_idx")
    private Compiler compiler;

    @Column(name = "com_file_cn")
    private String content;

    public CompilerContentDTO entityToDto() {
        return CompilerContentDTO.builder()
                .idx(idx)
                .compiler(compiler.entityToDto())
                .content(content)
                .build();
    }
}
