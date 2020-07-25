package com.xrl.mail.dbserver8093.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Table(name="login")
@Data
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "JDBC")
    private Integer loginid;
    @Column(name = "account")
    private String account;
    @Column(name = "password")
    private String password;

    @Column(name = "lastTime")
    private Date lasttime;

    @Column(name = "lastIp")
    private String lastip;

}