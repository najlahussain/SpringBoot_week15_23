package com.example.week14.persistence;

import org.springframework.data.repository.CrudRepository;

import com.example.week14.model.Programmer;

public interface ProgrammerDao extends CrudRepository<Programmer,Integer> {

}
