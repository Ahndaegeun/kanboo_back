package com.kanboo.www.domain.entity.board;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "board_report")
public class BoardReport {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_report_idx")
    private Long idx;

    @ManyToOne
    @JoinColumn(name = "board_idx")
    private Board board;

    @Column(name = "board_report_resn")
    private String reasonOfReport;
}
