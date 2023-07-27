package com.acp.week13.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.acp.week13.data.EmployeeDao;
import com.acp.week13.models.Employee;

@Controller
public class IndexController {

	@Autowired
	
	private EmployeeDao eDao;
	
	@GetMapping("index")
	public String index() {
		return "index";
	}
	
	@GetMapping("/save")
	public ModelAndView save(Employee e) {
		eDao.save(e);
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", e);		
		mv.setViewName("index");
		return mv;
	}
	
	@GetMapping("/delete")
	public ModelAndView delete(int id) {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("id", id);
		eDao.deleteById(id);
		mv.addObject("msg","Record deleted");
		return mv;
	}
}
