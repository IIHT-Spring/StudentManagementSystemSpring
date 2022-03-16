package com.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class SpringbootStudentManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootStudentManagementSystemApplication.class, args);
	}

}
