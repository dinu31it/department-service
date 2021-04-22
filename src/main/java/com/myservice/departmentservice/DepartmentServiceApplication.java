package com.myservice.departmentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		System.out.println("Enter inside MS main method");
		SpringApplication.run(DepartmentServiceApplication.class, args);
		System.out.println("Started MS of DepartmentService");
	}

}
