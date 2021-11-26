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
    @Column(name = "mem_idx")
    private Long idx;

    @Column(name = "mem_id")
    private String id;

    @Column(name = "mem_nick")
    private String nickname;

    @Column(name = "mem_cel_num")
    private String phoneNumber;

    @Column(name = "mem_token")
    private String token;

    @Column(name = "mem_tag")
    private String kTag;

    @Column(name = "mem_img")
    private String image;

    @Column(name = "mem_author")
    private String authority;

    @Column(name = "mem_pass")
    private String password;

    public MemberDTO entityToDto() {
        return MemberDTO.builder()
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
