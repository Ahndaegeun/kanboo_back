package com.kanboo.www.domain.entity.board;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "answer_report")
public class CommentReport {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answer_report_idx")
    private Long idx;

    @ManyToOne
    @JoinColumn(name = "answer_idx")
    private Comment comment;

    @Column(name = "answer_report_resn")
    private String reasonOfDelete;
}
