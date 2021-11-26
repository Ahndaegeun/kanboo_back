package com.kanboo.www.domain.entity.board;

import com.kanboo.www.domain.entity.member.Member;
import com.kanboo.www.dto.board.BoardDTO;
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
@Builder
@Table(name = "board")
public class Board {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_idx")
    private Long idx;

    @ManyToOne
    @JoinColumn(name = "mem_idx")
    private Member member;

    @Column(name = "board_cn")
    private String content;

    @Column(name = "board_date")
    private LocalDateTime writeDate;

    @Column(name = "like_idx")
    private int like;

    @Column(name = "report_num")
    private int numberOfReport;

    @Column(name = "del_at")
    private String isDelete;

    @Column(name = "board_category")
    private String category;

    @Column(name = "file_at")
    private String isFile;

    public BoardDTO entityToDto() {
        return BoardDTO.builder()
                .idx(idx)
                .member(member.entityToDto())
                .content(content)
                .writeDate(writeDate)
                .like(like)
                .numberOfReport(numberOfReport)
                .isDelete(isDelete)
                .category(category)
                .isFile(isFile)
                .build();
    }
}
