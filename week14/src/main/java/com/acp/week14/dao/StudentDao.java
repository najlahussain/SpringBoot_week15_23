package com.acp.week14.dao;

import org.springframework.data.repository.CrudRepository;

import com.acp.week14.model.Student;

public interface StudentDao extends CrudRepository<Student, Integer>{
	public Student findByEmail(String email);
}
