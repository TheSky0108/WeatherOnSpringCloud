package com.swg.weathereurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WeatherEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherEurekaClientApplication.class, args);
    }
}
