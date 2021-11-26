package com.kanboo.www.dto.board;

import com.kanboo.www.domain.entity.board.Board;
import com.kanboo.www.domain.entity.board.BoardReport;
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
public class BoardReportDTO {

    private Long idx;
    private BoardDTO board;
    private String reasonOfReport;

    public BoardReport dtoToEntity() {
        return BoardReport.builder()
                .idx(idx)
                .board(board.dtoToEntity())
                .reasonOfReport(reasonOfReport)
                .build();
    }
}
