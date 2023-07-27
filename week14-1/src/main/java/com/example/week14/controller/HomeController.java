package com.example.week14.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.example.week14.model.Programmer;
import com.example.week14.persistence.ProgrammerDao;

@Controller
public class HomeController {
	@Autowired
	private ProgrammerDao pDao;
@GetMapping("save")
public String save() {
	return "save";
}
@GetMapping("saveProgrammer")
public String saveProgrammer(Programmer p) {
	pDao.save(p);
	return "save";
}
@GetMapping("searchprogrammer")
public String searchProgrammer(int id) {
	ModelAndView mv=new ModelAndView("save");
	Programmer p=pDao.findById(id).orElse(null);
	return "save";
}
@GetMapping("deleteProgrammer")
public String deleteProgrammer(int id) {
    pDao.deleteById(id);
    return "save";
}

@GetMapping("updateProgrammer")
public String updateProgrammer(Programmer p) {
    pDao.save(p);
    return "save";
}
@GetMapping("addProgrammer")
public String addProgrammer(@ModelAttribute Programmer p) {
    pDao.save(p);
    return "save";
}
}
