package com.cursosdedesarrollo.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EdurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EdurekaServerApplication.class, args);
    }

}

