package com.kanboo.www.dto.project;

import com.kanboo.www.domain.entity.member.Member;
import com.kanboo.www.domain.entity.project.Issue;
import com.kanboo.www.domain.entity.project.Project;
import com.kanboo.www.dto.member.MemberDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IssueDTO {

    private Long idx;
    private ProjectDTO project;
    private MemberDTO member;
    private String content;
    private LocalDateTime issueDate;
    private String state;

    public Issue dtoToEntity() {
        return Issue.builder()
                .idx(idx)
                .project(project.dtoToEntity())
                .member(member.dtoToEntity())
                .content(content)
                .issueDate(issueDate)
                .state(state)
                .build();
    }
}
