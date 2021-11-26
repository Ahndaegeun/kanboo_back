package com.kanboo.www.dto.project;

import com.kanboo.www.domain.entity.project.Demand;
import com.kanboo.www.domain.entity.project.DemandContent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DemandContentDTO {

    private Long idx;
    private DemandDTO demand;
    private String demandNumber;
    private String classification;
    private String id;
    private String name;
    private String detail;
    private String request;
    private String remark;

    public DemandContent dtoToEntity() {
        return DemandContent.builder()
                .idx(idx)
                .demand(demand.dtoToEntity())
                .demandNumber(demandNumber)
                .classification(classification)
                .id(id)
                .name(name)
                .detail(detail)
                .request(request)
                .remark(remark)
                .build();
    }
}
