package com.kanboo.www.dto.project;

import com.kanboo.www.domain.entity.member.Member;
import com.kanboo.www.domain.entity.project.Calendar;
import com.kanboo.www.domain.entity.project.Project;
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
public class CalendarDTO {

    private Long idx;
    private ProjectDTO project;
    private MemberDTO member;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String color;
    private String classification;
    private String content;
    private String title;
    private String isDelete;
    private String reasonOfDelete;

    public Calendar dtoToEntity() {
        return Calendar.builder()
                .idx(idx)
                .project(project.dtoToEntity())
                .member(member.dtoToEntity())
                .startDate(startDate)
                .endDate(endDate)
                .color(color)
                .classification(classification)
                .content(content)
                .title(title)
                .isDelete(isDelete)
                .reasonOfDelete(reasonOfDelete)
                .build();
    }
}
