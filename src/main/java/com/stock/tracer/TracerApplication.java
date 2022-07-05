package com.stock.tracer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TracerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TracerApplication.class, args);
		System.out.println("TEST");
	}

}
