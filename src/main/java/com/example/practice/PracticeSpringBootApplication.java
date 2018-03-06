package com.example.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class PracticeSpringBootApplication {

	// とりあえず適当に表示
	@RequestMapping("/")
	String index() {
		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(PracticeSpringBootApplication.class, args);
	}
}
