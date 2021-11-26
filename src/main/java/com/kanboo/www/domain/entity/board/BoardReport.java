package com.kanboo.www.domain.entity.board;

import com.kanboo.www.dto.board.BoardReportDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "board_report")
@Builder
public class BoardReport {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_report_idx")
    private Long idx;

    @ManyToOne
    @JoinColumn(name = "board_idx")
    private Board board;

    @Column(name = "board_report_resn")
    private String reasonOfReport;

    public BoardReportDTO entityToDto() {
        return BoardReportDTO.builder()
                .idx(idx)
                .board(board.entityToDto())
                .reasonOfReport(reasonOfReport)
                .build();
    }
}
