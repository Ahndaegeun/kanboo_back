package com.kanboo.www.domain.entity.project;

import com.kanboo.www.dto.project.DemandContentDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "demand_content")
@Builder
public class DemandContent {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "demand_cn_idx")
    private Long idx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "demand_idx")
    private Demand demand;

    @Column(name = "demand_cn_num")
    private String demandNumber;

    @Column(name = "demand_cn_se")
    private String classification;

    @Column(name = "demand_cn_id")
    private String id;

    @Column(name = "demand_cn_nm")
    private String name;

    @Column(name = "demand_cn_detail")
    private String detail;

    @Column(name = "demand_cn_requst_nm")
    private String request;

    @Column(name = "demand_cn_rm")
    private String remark;

    public DemandContentDTO entityToDto() {
        return DemandContentDTO.builder()
                .idx(idx)
                .demand(demand.entityToDto())
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
