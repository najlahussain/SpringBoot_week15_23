package com.example.week14.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Programmer {
	
	@Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
int id;
String name;
String language;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}
@Override
public String toString() {
	return "Programmer [id=" + id + ", name=" + name + ", language=" + language + "]";
}

}
