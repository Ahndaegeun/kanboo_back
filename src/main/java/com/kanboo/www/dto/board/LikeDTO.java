package com.kanboo.www.dto.board;

import com.kanboo.www.domain.entity.board.Board;
import com.kanboo.www.domain.entity.board.Like;
import com.kanboo.www.domain.entity.member.Member;
import com.kanboo.www.dto.member.MemberDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LikeDTO {

    private Long likeIdx;
    private BoardDTO board;
    private MemberDTO member;

    public Like dtoToEntity() {
        return Like.builder()
                .likeIdx(likeIdx)
                .board(board.dtoToEntity())
                .member(member.dtoToEntity())
                .build();
    }
}
