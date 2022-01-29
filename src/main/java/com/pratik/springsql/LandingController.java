package com.pratik.springsql;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LandingController {

	@GetMapping("/")
	public String hello(){
		return "Hello World";
	}
	@GetMapping("/healthy")
	public String healthy(){
		return "I'm healthy!";
	}
	
	@GetMapping("/rolldice")
	public int rolldice(){
		return (int) ((Math.random() * (6 - 1)) + 1);
	}
}
