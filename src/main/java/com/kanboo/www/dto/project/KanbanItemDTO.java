package com.kanboo.www.dto.project;

import com.kanboo.www.domain.entity.member.Member;
import com.kanboo.www.domain.entity.project.Kanban;
import com.kanboo.www.domain.entity.project.KanbanItem;
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
public class KanbanItemDTO {

    private Long idx;
    private KanbanDTO kanban;
    private MemberDTO member;
    private String content;
    private String itemNumber;
    private LocalDateTime kanbanDate;
    private String badge;
    private String color;

    public KanbanItem dtoToEntity() {
        return KanbanItem.builder()
                .idx(idx)
                .kanban(kanban.dtoToEntity())
                .member(member.dtoToEntity())
                .content(content)
                .itemNumber(itemNumber)
                .kanbanDate(kanbanDate)
                .badge(badge)
                .color(color)
                .build();
    }
}
