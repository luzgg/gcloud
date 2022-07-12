package com.github.luzgg.call;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CallProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CallProviderApplication.class, args);
    }

}
