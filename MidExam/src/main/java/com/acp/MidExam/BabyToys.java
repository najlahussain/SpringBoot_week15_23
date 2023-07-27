package com.acp.MidExam;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class BabyToys extends Toy {
	public BabyToys() {
		super();
		// TODO Auto-generated constructor stub
		 batteryHealth=6;
	}

	@Override
	public int charge(String time) {
		// TODO Auto-generated method stub
		int maximumCharge = 6 - batteryHealth;
        int chargeCount = Math.min(Integer.parseInt(time) / 15, maximumCharge);
        batteryHealth += chargeCount;
        if (chargeCount == 0) {
            System.out.println("Hurrah!!Battery is fully charged");
        } 
        
        return batteryHealth;
        
	}

}
