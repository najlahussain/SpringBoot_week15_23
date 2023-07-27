package com.acp.springbootexample.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.acp.springbootexample.model.Programmer;

public interface ProgrammerDao extends CrudRepository<Programmer, Integer>{
	Programmer findByName(String name);
	List <Programmer> findByIdGreaterThan(int id);
}
