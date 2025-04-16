package com.example.openforeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringOpenForeign1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringOpenForeign1Application.class, args);
	}

}
