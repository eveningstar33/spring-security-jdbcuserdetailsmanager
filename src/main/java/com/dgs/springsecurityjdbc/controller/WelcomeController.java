package com.dgs.springsecurityjdbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	public String welcome() {
		
		return "welcome";
	}
	
	@GetMapping("/hello")
	public String hello() {
		
		return "hello";
	}
	
	@GetMapping("/home")
	public String home() {
		
		return "home";
	}
	
}
