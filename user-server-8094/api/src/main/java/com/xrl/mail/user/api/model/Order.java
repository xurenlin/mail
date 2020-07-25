package com.xrl.mail.user.api.model;

import lombok.Data;

import javax.persistence.*;

@Table(name="user")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "JDBC")
    private Integer userid;

    @Column(name = "userName")
    private Integer username;

    @Column(name = "userAge")
    private Integer userage;

    @Column(name = "userSex")
    private String usersex;

}