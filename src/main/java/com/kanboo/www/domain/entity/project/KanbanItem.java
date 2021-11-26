package com.kanboo.www.domain.entity.project;

import com.kanboo.www.domain.entity.member.Member;
import com.kanboo.www.dto.project.KanbanItemDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "kanban_item")
@Builder
public class KanbanItem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kb_itm_idx")
    private Long idx;

    @ManyToOne
    @JoinColumn(name = "kb_idx")
    private Kanban kanban;

    @ManyToOne
    @JoinColumn(name = "mem_idx")
    private Member member;

    @Column(name = "kb_cn")
    private String content;

    @Column(name = "kb_itm_num")
    private String itemNumber;

    @Column(name = "kb_date")
    private LocalDateTime kanbanDate;

    @Column(name = "kb_badge")
    private String badge;

    @Column(name = "kb_color")
    private String color;

    public KanbanItemDTO entityToDto() {
        return KanbanItemDTO.builder()
                .idx(idx)
                .kanban(kanban.entityToDto())
                .member(member.entityToDto())
                .content(content)
                .itemNumber(itemNumber)
                .kanbanDate(kanbanDate)
                .badge(badge)
                .color(color)
                .build();
    }
}
