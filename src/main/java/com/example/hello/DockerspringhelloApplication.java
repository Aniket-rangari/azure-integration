package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerspringhelloApplication {
	
	
	@GetMapping("/welcomee")
	public String helloWorld() {
		return "Hello from spring boot application";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerspringhelloApplication.class, args);
	}

}
