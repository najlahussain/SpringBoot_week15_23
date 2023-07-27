package com.acp.midterm;

import org.springframework.stereotype.Component;

@Component
public abstract class Toy 
{
	private int batteryHealth;
	
	 public abstract int charge(String time);
	 
	}
	
	


