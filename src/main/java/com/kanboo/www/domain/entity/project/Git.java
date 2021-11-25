package com.kanboo.www.domain.entity.project;

import com.kanboo.www.domain.entity.project.idclass.GitId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "git")
public class Git {

    @EmbeddedId
    private GitId id;

    @MapsId("project")
    @ManyToOne
    @JoinColumn(name = "prjct_idx")
    private Project project;

    @Column(name = "git_repo")
    private String repoAddress;
}