package com.jacobz.nxauto.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MSShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(MSShopApplication.class, args);
	}

}
