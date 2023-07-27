package com.acp.week13.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pets {
	
	@Id
	int id;
	String name;
	String info;
//	float price;
	
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
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
/*	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
*/	
}