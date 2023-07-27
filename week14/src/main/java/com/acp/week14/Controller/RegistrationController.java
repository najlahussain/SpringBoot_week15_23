package com.acp.week14.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.acp.week14.dao.StudentDao;
import com.acp.week14.model.Student;

@Controller
public class RegistrationController {
	
	@Autowired
	private StudentDao sDao;
	
	@GetMapping("regHome")
	public String regHome() {
		return "regHome";
	}
	
	@GetMapping("register")
	public ModelAndView register(Student s, String cpassword) {
		ModelAndView mv = new ModelAndView("regHome");
		if(s.verifyPassword(cpassword))
		{
			System.out.println(s);
			System.out.println("password verified");
			sDao.save(s);
		
		}
		else
			System.out.println("password does not match");
		
		return mv;
	}
	@GetMapping("findEmail")
	public ModelAndView findEmail(String email) {
		ModelAndView mv = new ModelAndView("regHome");
		Student s = sDao.findByEmail(email);
		mv.addObject("obj",s);
		return mv;
	}
	
}
