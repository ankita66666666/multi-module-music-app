package com.stackroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.PropertySource;

@EnableEurekaClient

@SpringBootApplication
@PropertySource("classpath:application-mongo.properties")

public class TrackServiceApplication {

        public static void main(String[] args) {
            SpringApplication.run(TrackServiceApplication.class, args);
        }
    }



