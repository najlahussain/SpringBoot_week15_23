package com.acp.midterm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Person 
{
	@Autowired
	private Toy toy;
	private String name;
	public Person(Toy toy, String name) {
		super();
		this.toy = toy;
		this.name = name;
	}
	public Person() {
		super();
	}
	public Toy getToy() {
		return toy;
	}
	public void setToy(Toy toy) {
		this.toy = toy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
