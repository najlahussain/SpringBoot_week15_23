package com.acp.springbootexample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String display() {
		return "index";
	}
	
//	record Greet(String value) {}
}
