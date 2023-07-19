package com.jacobz.nxauto.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.jacobz.nxauto.auth","com.jacobz.nxauto.security"})
public class MSAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(MSAuthApplication.class, args);
    }
}
