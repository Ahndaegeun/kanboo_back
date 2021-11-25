package com.kanboo.www.domain.entity.board;

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
@Table(name = "answer")
public class Comment {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answer_idx")
    private Long idx;

    @ManyToOne
    @JoinColumn(name = "board_idx")
    private Board board;

    @ManyToOne
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
}
