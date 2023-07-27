package com.acp.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.acp.exam.model.Book;
import com.acp.exam.repo.BookDao;

@Controller
public class HomeController {

	@Autowired
	private BookDao bDao;
	
	@GetMapping("home")
	public String home() {
		return "home";
	}
	
	@GetMapping("addBooks")
	public ModelAndView addBooks(Book book) {
		ModelAndView mv = new ModelAndView("home");
		bDao.save(book);
		mv.addObject("book",book);
		return mv;
	}
}