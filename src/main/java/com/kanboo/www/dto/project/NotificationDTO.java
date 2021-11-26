package com.kanboo.www.dto.project;

import com.kanboo.www.domain.entity.member.Member;
import com.kanboo.www.domain.entity.project.Notification;
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
public class NotificationDTO {

    private Long idx;
    private MemberDTO member;
    private ProjectDTO project;
    private String content;
    private String isRead;
    private LocalDateTime notificationDate;
    private String classification;

    public Notification dtoToEntity() {
        return Notification.builder()
                .idx(idx)
                .member(member.dtoToEntity())
                .project(project.dtoToEntity())
                .content(content)
                .isRead(isRead)
                .notificationDate(notificationDate)
                .classification(classification)
                .build();
    }
}
