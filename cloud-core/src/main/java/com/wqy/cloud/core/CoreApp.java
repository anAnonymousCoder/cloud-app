package com.wqy.cloud.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * cloud-service module.
 *
 * @author wqy
 * @version 1.0 2020/10/6
 */
@SpringBootApplication
@EntityScan(basePackages = {"com.wqy.cloud.core.model.entity"})
@EnableEurekaClient
public class CoreApp {
    public static void main(String[] args) {
        SpringApplication.run(CoreApp.class, args);
    }
}
