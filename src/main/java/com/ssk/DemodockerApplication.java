package com.ssk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.controller")
public class DemodockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemodockerApplication.class, args);
	}

}
