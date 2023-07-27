package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyServicesController {
	
	@Autowired
	private CurrencyServiceConfiguration con;
	
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration retrieveAllCourses() {
		System.out.println("creating object con "+		this.con.getUrl());
	
		return con;
	}
}
