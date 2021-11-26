package com.kanboo.www.dto.project;

import com.kanboo.www.domain.entity.member.Member;
import com.kanboo.www.domain.entity.project.Chatting;
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
public class ChattingDTO {

    private Long idx;
    private ProjectDTO project;
    private MemberDTO member;
    private String content;
    private LocalDateTime chatDate;

    public Chatting dtoToEntity() {
        return Chatting.builder()
                .idx(idx)
                .project(project.dtoToEntity())
                .member(member.dtoToEntity())
                .content(content)
                .chatDate(chatDate)
                .build();
    }
}
