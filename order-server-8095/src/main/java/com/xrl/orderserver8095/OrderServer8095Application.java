package com.xrl.orderserver8095;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages={"com.xrl.orderserver8095.model",
        "com.xrl.orderserver8095.common",
        "com.xrl.orderserver8095.mapper"})
@SpringBootApplication
public class OrderServer8095Application {

    public static void main(String[] args) {
        SpringApplication.run(OrderServer8095Application.class, args);
    }

}
