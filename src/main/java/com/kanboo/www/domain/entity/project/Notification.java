package com.kanboo.www.domain.entity.project;

import com.kanboo.www.domain.entity.member.Member;
import com.kanboo.www.dto.project.NotificationDTO;
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
@Table(name = "notification")
@Builder
public class Notification {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ntcn_idx")
    private Long idx;

    @ManyToOne
    @JoinColumn(name = "mem_idx")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "prjct_idx")
    private Project project;

    @Column(name = "ntcn_cn")
    private String content;

    @Column(name = "ntcn_at")
    private String isRead;

    @Column(name = "ntcn_date")
    private LocalDateTime notificationDate;

    @Column(name = "ntcn_se")
    private String classification;

    public NotificationDTO entityToDto() {
        return NotificationDTO.builder()
                .idx(idx)
                .member(member.entityToDto())
                .project(project.entityToDto())
                .content(content)
                .isRead(isRead)
                .notificationDate(notificationDate)
                .classification(classification)
                .build();
    }
}
