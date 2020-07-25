package com.xrl.mail.dbserver8093;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages={"com.xrl.mail.dbserver8093.model",
        "com.xrl.mail.dbserver8093.common",
        "com.xrl.mail.dbserver8093.mapper"})
@SpringBootApplication
public class DbServer8093Application {

    public static void main(String[] args) {
        SpringApplication.run(DbServer8093Application.class, args);
    }

}
