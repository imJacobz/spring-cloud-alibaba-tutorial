package com.jacobz.nxauto.shop;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class MSShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(MSShopApplication.class, args);
	}

}
