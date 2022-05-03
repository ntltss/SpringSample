package com.example.SpringSample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSampleApplication.class, args);
	}

	@RequestMapping("/hello")
	String index(){
		return "Hello World!";
	}

}
