package com.kanboo.www.domain.entity.project;

import com.kanboo.www.domain.entity.member.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "chat")
public class Chatting {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chat_idx")
    private Long idx;

    @ManyToOne
    @JoinColumn(name = "prjct_idx")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "mem_idx")
    private Member member;

    @Column(name = "chat_cn")
    private String content;

    @Column(name = "chat_date")
    private LocalDateTime chatDate;
}
