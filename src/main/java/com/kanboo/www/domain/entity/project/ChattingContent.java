package com.kanboo.www.domain.entity.project;

import com.kanboo.www.domain.entity.member.Member;
import com.kanboo.www.dto.project.ChattingContentDTO;
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
@Table(name = "chatting_content")
@Builder
public class ChattingContent {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chatContentIdx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mem_idx")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chat_idx")
    private Chat chat;

    private String chatCn;
    private LocalDateTime chatCnDate;

    public ChattingContentDTO entityToDto() {
        return ChattingContentDTO.builder()
                .chatContentIdx(chatContentIdx)
                .member(member.entityToDto())
                .chat(chat.entityToDto())
                .chatCn(chatCn)
                .chatCnDate(chatCnDate)
                .build();
    }
}
