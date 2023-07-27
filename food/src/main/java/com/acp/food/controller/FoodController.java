package com.acp.food.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.acp.food.model.Food;

@Controller
public class FoodController {

	@GetMapping("/home")
	public String getHome(Model model) {
		model.addAttribute("message", "Hello");
		List<Food> food =  Arrays.asList(
				new Food("Pizza", 1000.0),
				new Food("Doughnut", 200.0));
		model.addAttribute("foods", food);
		return "home";
	}
}
