package com.kanboo.www.dto.project;

import com.kanboo.www.domain.entity.member.Member;
import com.kanboo.www.domain.entity.project.Chatting;
import com.kanboo.www.domain.entity.project.ChattingContent;
import com.kanboo.www.dto.member.MemberDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChattingContentDTO {

    private Long idx;
    private MemberDTO member;
    private ChattingDTO chatting;
    private String content;
    private LocalDateTime chatDate;

    public ChattingContent dtoToEntity() {
        return ChattingContent.builder()
                .idx(idx)
                .member(member.dtoToEntity())
                .chatting(chatting.dtoToEntity())
                .content(content)
                .chatDate(chatDate)
                .build();
    }
}
