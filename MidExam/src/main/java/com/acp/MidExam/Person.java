package com.acp.MidExam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Person {
private String name;
@Autowired
private Toy toy;
public Person(String name, Toy toy) {
	super();
	this.name = name;
	this.toy = toy;
}
public void playWithToy() {
    toy.play();
}
public void chargeTheToy(String time) {
    int newBatteryHealth = toy.charge(time);
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Toy getToy() {
	return toy;
}
public void setToy(Toy toy) {
	this.toy = toy;
}
@Override
public String toString() {
	return "Person [name=" + name + ", toy=" + toy + "]";
}

}
