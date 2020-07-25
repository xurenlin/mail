package com.xrl.mail.dbserver8093.model;

import lombok.Data;

import javax.persistence.*;
@Table(name="user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "JDBC")
    private Integer userid;

    @Column(name = "userName")
    private String username;

    @Column(name = "userAge")
    private Integer userage;

    @Column(name = "userSex")
    private String usersex;

}