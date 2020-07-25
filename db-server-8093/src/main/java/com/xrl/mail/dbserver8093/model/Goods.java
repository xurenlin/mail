package com.xrl.mail.dbserver8093.model;

import lombok.Data;

import javax.persistence.*;
@Data
@Table(name="goods")
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "JDBC")
    private Integer goodsid;

    @Column(name = "goodName")
    private String goodname;

    @Column(name = "goodPrice")
    private Long goodprice;

}