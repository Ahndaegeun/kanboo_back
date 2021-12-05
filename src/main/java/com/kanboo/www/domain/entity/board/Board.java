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
    private Long boardIdx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mem_idx")
    private Member member;

    private String boardCn;
    private LocalDateTime boardDate;
    private int likeNum;
    private int reportNum;
    private String delAt;
    private String boardCategory;
    private String fileAt;

    public BoardDTO entityToDto() {
        return BoardDTO.builder()
                .idx(boardIdx)
                .member(member.entityToDto())
                .content(boardCn)
                .writeDate(boardDate)
                .like(likeNum)
                .numberOfReport(reportNum)
                .isDelete(delAt)
                .category(boardCategory)
                .isFile(fileAt)
                .build();
    }
}
