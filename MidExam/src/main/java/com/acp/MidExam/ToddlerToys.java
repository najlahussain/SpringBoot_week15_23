package com.acp.MidExam;

import org.springframework.stereotype.Component;
@Component
public class ToddlerToys extends Toy{
	public ToddlerToys() {
		super();
		// TODO Auto-generated constructor stub
		batteryHealth=5;
	}

	@Override
	public int charge(String time) {
		// TODO Auto-generated method stub
        int maximumCharge = 5 - batteryHealth;
        int chargingpoints = Math.min(Integer.parseInt(time) / 15, maximumCharge);
        batteryHealth += chargingpoints;
        if (chargingpoints == 0) {
            System.out.println("Hurrah!!Battery is fully charged");
        } 
        return batteryHealth;
    }

	}


