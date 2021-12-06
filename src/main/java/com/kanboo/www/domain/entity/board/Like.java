package com.kanboo.www.domain.entity.board;

import com.kanboo.www.domain.entity.member.Member;
import com.kanboo.www.dto.board.LikeDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "like")
@Builder
public class Like {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long likeIdx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_idx")
    private Board board;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mem_idx")
    private Member member;

    public LikeDTO entityToDto() {
        return LikeDTO.builder()
                .likeIdx(likeIdx)
                .board(board.entityToDto())
                .member(member.entityToDto())
                .build();
    }
}
