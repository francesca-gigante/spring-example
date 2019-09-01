package com.fania.ocpexample.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class SpringExampleApplication {

	@GetMapping("/")
	public String welcome() {
		return "Welcome to java FG";
	}
	
	@GetMapping("/{input}")
	public String congrats(@PathVariable String input) {
		return "hi " + input + " your application deployed successfully";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringExampleApplication.class, args);
	}

}
