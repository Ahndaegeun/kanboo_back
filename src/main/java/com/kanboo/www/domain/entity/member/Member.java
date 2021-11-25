package com.kanboo.www.domain.entity.member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "member")
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
}
