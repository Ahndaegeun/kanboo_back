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

    private Long calIdx;
    private ProjectDTO project;
    private MemberDTO member;
    private LocalDateTime calStartDate;
    private LocalDateTime calEndDate;
    private String calColor;
    private String calSe;
    private String calCn;
    private String calTitle;
    private String calDelAt;
    private String calDelResn;

    public Calendar dtoToEntity() {
        return Calendar.builder()
                .calIdx(calIdx)
                .project(project.dtoToEntity())
                .member(member.dtoToEntity())
                .calStartDate(calStartDate)
                .calEndDate(calEndDate)
                .calColor(calColor)
                .calSe(calSe)
                .calCn(calCn)
                .calTitle(calTitle)
                .calDelAt(calDelAt)
                .calDelResn(calDelResn)
                .build();
    }
}
