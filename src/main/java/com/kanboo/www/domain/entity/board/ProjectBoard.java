package com.kanboo.www.domain.entity.board;

import com.kanboo.www.domain.entity.board.idclass.ProjectBoardId;
import com.kanboo.www.domain.entity.project.Project;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "project_board")
@IdClass(ProjectBoardId.class)
public class ProjectBoard {

    @Id
    @ManyToOne
    @JoinColumn(name = "board_idx")
    private Board board;

    @Id
    @ManyToOne
    @JoinColumn(name = "prjct_idx")
    private Project project;
}
