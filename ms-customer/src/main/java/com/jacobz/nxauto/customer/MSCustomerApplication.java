package com.jacobz.nxauto.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan({"com.jacobz.nxauto.customer", "com.jacobz.nxauto.security"})
public class MSCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MSCustomerApplication.class, args);
    }

}

