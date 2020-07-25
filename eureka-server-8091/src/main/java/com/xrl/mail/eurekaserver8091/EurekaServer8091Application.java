package com.xrl.mail.eurekaserver8091;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer8091Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer8091Application.class, args);
    }

}
