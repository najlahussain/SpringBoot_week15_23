package com.acp.exam.repo;

import org.springframework.data.repository.CrudRepository;

import com.acp.exam.model.Book;

public interface BookDao extends CrudRepository<Book,Integer>{
	
}
