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
    @Column(name = "chat_content_idx")
    private Long idx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mem_idx")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chat_idx")
    private Chatting chatting;

    @Column(name = "chat_cn")
    private String content;

    @Column(name = "chat_cn_date")
    private LocalDateTime chatDate;

    public ChattingContentDTO entityToDto() {
        return ChattingContentDTO.builder()
                .idx(idx)
                .member(member.entityToDto())
                .chatting(chatting.entityToDto())
                .content(content)
                .chatDate(chatDate)
                .build();
    }
}
