package com.acp.week12;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/second")
	public ModelAndView second(String name) {
		ModelAndView mv = new ModelAndView("second");
		mv.addObject("obj", name);
		return mv;
	}
}
