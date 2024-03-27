package com.jacobz.nxauto.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.jacobz.nxauto")
@ComponentScan({"com.jacobz.nxauto"})
public class MSShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(MSShopApplication.class, args);
	}

}
