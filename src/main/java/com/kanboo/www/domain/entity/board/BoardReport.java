package com.kanboo.www.domain.entity.board;

import com.kanboo.www.domain.entity.member.Member;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_idx")
    private Board board;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mem_idx")
    private Member member;

    @Column(name = "board_report_resn")
    private String reasonOfReport;

    public BoardReportDTO entityToDto() {
        return BoardReportDTO.builder()
                .idx(idx)
                .board(board.entityToDto())
                .member(member.entityToDto())
                .reasonOfReport(reasonOfReport)
                .build();
    }
}
