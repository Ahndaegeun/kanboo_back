package com.kanboo.www.dto.member;

import com.kanboo.www.domain.entity.member.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {

    private Long idx;
    private String id;
    private String nickname;
    private String phoneNumber;
    private String token;
    private String kTag;
    private String image;
    private String authority;
    private String password;

    public Member dtoToEntity() {
        return Member.builder()
                .idx(idx)
                .id(id)
                .nickname(nickname)
                .phoneNumber(phoneNumber)
                .token(token)
                .kTag(kTag)
                .image(image)
                .authority(authority)
                .password(password)
                .build();
    }
}
