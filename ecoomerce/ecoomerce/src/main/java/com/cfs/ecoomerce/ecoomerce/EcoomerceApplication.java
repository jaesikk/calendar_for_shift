package com.cfs.ecoomerce.ecoomerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EcoomerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcoomerceApplication.class, args);
    }

}
