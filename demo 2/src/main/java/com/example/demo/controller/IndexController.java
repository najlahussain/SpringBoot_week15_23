package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Model.Employee;

@Controller
public class IndexController {
		
		@GetMapping("index")
		public ModelAndView index() {
			ModelAndView mv = new ModelAndView();		
			mv.setViewName("index");
			return mv;
		}
		
		@GetMapping("/submit")
		public ModelAndView submit(Employee e) {
			ModelAndView mv = new ModelAndView("view");
			mv.addObject("emp", e);
			return mv;
		}
}

