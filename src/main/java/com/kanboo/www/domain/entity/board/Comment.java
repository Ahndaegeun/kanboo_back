package com.kanboo.www.domain.entity.board;

import com.kanboo.www.domain.entity.member.Member;
import com.kanboo.www.dto.board.CommentDTO;
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
@Table(name = "answer")
@Builder
public class Comment {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answer_idx")
    private Long idx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_idx")
    private Board board;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mem_idx")
    private Member member;

    @Column(name = "answer_cn")
    private String content;

    @Column(name = "answer_report_num")
    private int numberOfReport;

    @Column(name = "answer_date")
    private LocalDateTime writeDate;

    @Column(name = "answer_del_at")
    private String isDelete;

    public CommentDTO entityToDto() {
        return CommentDTO.builder()
                .idx(idx)
                .board(board.entityToDto())
                .member(member.entityToDto())
                .content(content)
                .numberOfReport(numberOfReport)
                .writeDate(writeDate)
                .isDelete(isDelete)
                .build();
    }
}
