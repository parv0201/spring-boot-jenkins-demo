package com.parvkapadia.springbootjenkinsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJenkinsDemoApplication.class, args);
		System.out.println("Starting Spring Boot Application");
	}

}
