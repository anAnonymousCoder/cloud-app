package com.wqy.cloud.cloudservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * cloud-service module.
 * @author wqy
 * @version 1.0 2020/10/6
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudServiceApplication.class, args);
    }

}
