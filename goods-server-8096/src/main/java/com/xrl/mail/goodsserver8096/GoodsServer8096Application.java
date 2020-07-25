package com.xrl.mail.goodsserver8096;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages={"com.xrl.mail.goodsserver8096.model",
        "com.xrl.mail.goodsserver8096.common",
        "com.xrl.mail.goodsserver8096.mapper"})
@SpringBootApplication
public class GoodsServer8096Application {

    public static void main(String[] args) {
        SpringApplication.run(GoodsServer8096Application.class, args);
    }

}
