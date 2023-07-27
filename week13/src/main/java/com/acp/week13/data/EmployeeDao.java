package com.acp.week13.data;

import org.springframework.data.repository.CrudRepository;

import com.acp.week13.models.Employee;

public interface EmployeeDao extends CrudRepository<Employee,Integer>{

}
