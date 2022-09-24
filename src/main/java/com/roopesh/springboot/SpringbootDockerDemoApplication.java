package com.roopesh.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class SpringbootDockerDemoApplication {
@GetMapping("/welcome")
@ResponseBody
	public String welcome()
	{
		return "Spring Boot Docker";
		
	}

@GetMapping("/add")
@ResponseBody
public String add()
{
	return "Spring Boot Docker roopesh";
}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerDemoApplication.class, args);
	}

}
