package com.acp.week13.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.acp.week13.models.Login;

@Controller
public class LoginController {
	
	@GetMapping("login")
	public String login() {
		return "Login";
	}
	
	@GetMapping("/verifyLogin")
	public ModelAndView verify(@ModelAttribute Login cred) {
		ModelAndView mv = new ModelAndView();
		System.out.println(cred.getEmail());
		System.out.println(cred.getPass());
		if(cred.getEmail().equalsIgnoreCase("acp@riphah.com")&&(cred.getPass().equals("acp123")))
		{
			System.out.println("Login successful");
			mv.setViewName("index");
		}
		else
		{
			mv.addObject("msg", "Either email or password is incorrect, please enter again");
			mv.setViewName("Login");
		}
		return mv;
	}
	
	
}
