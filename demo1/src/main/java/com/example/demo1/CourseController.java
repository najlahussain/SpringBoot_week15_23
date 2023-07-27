package com.example.demo1;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {	

	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1, "ACP","Ivor Horton"),
				new Course(2, "BPE","Najla Raza"),
				new Course(3, "SDA","Najla Raza"),
				new Course(4, "SDA","Najla Raza")
				
				);
	}
}
