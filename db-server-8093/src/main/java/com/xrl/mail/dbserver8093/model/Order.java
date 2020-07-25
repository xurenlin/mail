package com.xrl.mail.dbserver8093.model;

import lombok.Data;

import javax.persistence.*;
@Table(name="order")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "JDBC")
    private Integer orderid;

    @Column(name = "userId")
    private Integer userid;

    @Column(name = "goodsId")
    private Integer goodsid;

    @Column(name = "pId")
    private String pid;

}