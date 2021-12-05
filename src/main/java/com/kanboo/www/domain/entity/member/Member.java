package com.kanboo.www.domain.entity.member;

import com.kanboo.www.domain.entity.project.Chatting;
import com.kanboo.www.dto.member.MemberDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "member")
@Builder
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memIdx;

    private String memId;
    private String memNick;
    private String memCelNum;
    private String memToken;
    private String memTag;
    private String memImg;
    private String memAuthor;
    private String memPass;

    public MemberDTO entityToDto() {
        return MemberDTO.builder()
                .idx(memIdx)
                .id(memId)
                .nickname(memNick)
                .phoneNumber(memCelNum)
                .token(memToken)
                .kTag(memTag)
                .image(memImg)
                .authority(memAuthor)
                .password(memPass)
                .build();
    }
}
