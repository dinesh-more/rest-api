package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@SpringBootApplication
public class RestApiApplication {

	@GetMapping(value = "/rest")
	public String testApi() {
		return "Working REST API";
	}

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

}
