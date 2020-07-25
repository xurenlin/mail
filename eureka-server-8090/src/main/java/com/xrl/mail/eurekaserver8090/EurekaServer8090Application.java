package com.xrl.mail.eurekaserver8090;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer8090Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer8090Application.class, args);
    }

}
