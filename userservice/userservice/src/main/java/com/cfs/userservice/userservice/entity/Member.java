package com.cfs.userservice.userservice.entity;


import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String nickName;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String introduce;

    @Column
    private String image;

}


