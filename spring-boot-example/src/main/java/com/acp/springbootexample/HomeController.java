package com.acp.springbootexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

import com.acp.springbootexample.dao.ProgrammerDao;
import com.acp.springbootexample.model.*;

@Controller
public class HomeController {
	
	@Autowired
	private ProgrammerDao pDao;
	
	@GetMapping("home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/addProg")
	public String add(Programmer p) {
		pDao.save(p);//saving object in database
		return "home";
	}
	
	@GetMapping("/searchProg")
	public ModelAndView search(int id) {
		ModelAndView mv = new ModelAndView("display");
		//Programmer p = pDao.findById(id).orElse(new Programmer());//searching object based on id in database
		//mv.addObject("p", p);
		System.out.println(pDao.findByIdGreaterThan(id));
		return mv;
	}
	
	@GetMapping("/searchProgName")
	public ModelAndView searchByName(String name) {
		ModelAndView mv = new ModelAndView("display");
		Programmer p = pDao.findByName(name);//searching object based on id in database
		mv.addObject("p", p);
		return mv;
	}
	
	@GetMapping("/back")
	public String back() {
		return "home";
	}
}
