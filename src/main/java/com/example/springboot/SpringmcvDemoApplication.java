package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.springboot.controller","com.example.springboot.conf"})
public class SpringmcvDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmcvDemoApplication.class, args);
	}
}
