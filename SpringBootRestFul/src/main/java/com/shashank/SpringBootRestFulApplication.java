package com.shashank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringBootRestFulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestFulApplication.class, args);
	}

}