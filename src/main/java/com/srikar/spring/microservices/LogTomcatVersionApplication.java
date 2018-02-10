package com.srikar.spring.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

//@ComponentScan
@Configuration
@EnableAutoConfiguration
public class LogTomcatVersionApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogTomcatVersionApplication.class, args);
	}
}
