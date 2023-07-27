package com.acp.springbootexample.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Programmer {
	@Id
	private int id;
	private String name;
	private String language;
	
	@Override
	public String toString() {
		return "Programmer [name=" + name + ", id=" + id + ", language=" + language + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
}
