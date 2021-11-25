package com.kanboo.www.domain.entity.member;

import com.kanboo.www.domain.entity.member.idclass.ProjectMemberId;
import com.kanboo.www.domain.entity.project.Project;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "project_member")
@IdClass(ProjectMemberId.class)
public class ProjectMember {

    @Id
    @ManyToOne
    @JoinColumn(name = "mem_idx")
    private Member member;

    @Id
    @ManyToOne
    @JoinColumn(name = "prjct_idx")
    private Project project;

    @Column(name = "prjct_mem_role")
    private String role;
}
