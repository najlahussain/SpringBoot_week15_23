package com.acp.week14.model;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.validation.annotation.Validated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_students")
@Validated
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	@Column(name="name",nullable=false)
	private String name;
	
	private String email;
	private String password;
	
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(100);

	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}

	public boolean verifyPassword(String password) {
		if(this.password.equals(password))
			return true;
		return false;
	}
	
	public void setId(int id) {
		this.id=id;
		//this.id=ID_GENERATOR.getAndIncrement();
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
