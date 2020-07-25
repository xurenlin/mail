package com.xrl.mail.loginserver8097;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages={"com.xrl.mail.loginserver8097.model",
        "com.xrl.mail.loginserver8097.common",
        "com.xrl.mail.loginserver8097.mapper"})
@SpringBootApplication
public class LoginServer8097Application {

    public static void main(String[] args) {
        SpringApplication.run(LoginServer8097Application.class, args);
    }

}
