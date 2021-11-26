package com.kanboo.www.dto.member;

import com.kanboo.www.domain.entity.member.Ban;
import com.kanboo.www.domain.entity.member.Member;
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
public class BanDTO {

    private Long idx;
    private MemberDTO member;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public Ban dtoToEntity() {
        return Ban.builder()
                .idx(idx)
                .member(member.dtoToEntity())
                .startDate(startDate)
                .endDate(endDate)
                .build();
    }
}
