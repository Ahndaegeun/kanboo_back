package com.kanboo.www.domain.entity.board;

import com.kanboo.www.dto.board.BoardFileDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "file")
@Builder
public class BoardFile {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "file_idx")
    private Long idx;

    @ManyToOne
    @JoinColumn(name = "board_idx")
    private Board board;

    @Column(name = "file_name")
    private String name;

    public BoardFileDTO entityToDto() {
        return BoardFileDTO.builder()
                .idx(idx)
                .board(board.entityToDto())
                .name(name)
                .build();
    }
}
