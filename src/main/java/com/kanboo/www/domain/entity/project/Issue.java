package com.kanboo.www.domain.entity.project;

import com.kanboo.www.domain.entity.member.Member;
import com.kanboo.www.dto.project.IssueDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "issue")
@Builder
public class Issue {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "issue_idx")
    private Long idx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prjct_idx")
    private Project project;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mem_idx")
    private Member member;

    @Column(name = "issue_cn")
    private String content;
    @Column(name = "issue_date")
    private LocalDateTime issueDate;
    @Column(name = "issue_state")
    private String state;

    public IssueDTO entityToDto() {
        return IssueDTO.builder()
                .idx(idx)
                .project(project.entityToDto())
                .member(member.entityToDto())
                .content(content)
                .issueDate(issueDate)
                .state(state)
                .build();
    }
}
