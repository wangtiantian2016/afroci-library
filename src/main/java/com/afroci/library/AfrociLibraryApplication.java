package com.afroci.library;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   //equivalent to using the above 3 annotations in spring
@MapperScan("com.afroci.library.dao")
public class AfrociLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AfrociLibraryApplication.class, args);
	}
}
