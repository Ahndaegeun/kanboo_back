package com.kanboo.www.dto.board;

import com.kanboo.www.domain.entity.board.Board;
import com.kanboo.www.domain.entity.member.Member;
import com.kanboo.www.dto.member.MemberDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardDTO {

    private Long idx;
    private MemberDTO member;
    private String content;
    private LocalDateTime writeDate;
    private int like;
    private int numberOfReport;
    private String isDelete;
    private String category;
    private String isFile;

    public Board dtoToEntity() {
        return Board.builder()
                .idx(idx)
                .member(member.dtoToEntity())
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
