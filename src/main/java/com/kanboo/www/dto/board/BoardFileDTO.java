package com.kanboo.www.dto.board;

import com.kanboo.www.domain.entity.board.Board;
import com.kanboo.www.domain.entity.board.BoardFile;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardFileDTO {

    private Long idx;
    private BoardDTO board;
    private String name;

    public BoardFile dtoToEntity() {
        return BoardFile.builder()
                .idx(idx)
                .board(board.dtoToEntity())
                .name(name)
                .build();
    }
}
