package com.kanboo.www.dto.board;

import com.kanboo.www.domain.entity.board.Board;
import com.kanboo.www.domain.entity.board.Comment;
import com.kanboo.www.domain.entity.member.Member;
import com.kanboo.www.dto.member.MemberDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommentDTO {

    private Long idx;
    private BoardDTO board;
    private MemberDTO member;
    private String content;
    private int numberOfReport;
    private LocalDateTime writeDate;
    private String isDelete;

    public Comment dtoToEntity() {
        return Comment.builder()
                .idx(idx)
                .board(board.dtoToEntity())
                .member(member.dtoToEntity())
                .content(content)
                .numberOfReport(numberOfReport)
                .writeDate(writeDate)
                .isDelete(isDelete)
                .build();
    }
}
