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
		return "I am healthy";
	}
	
	@GetMapping("/rolldice")
	public int rolldice(){
	        // define the range
		int max = 10;
		int min = 1;
		int range = max - min + 1;
		return (int)(Math.random() * range) + min;
	}
}
