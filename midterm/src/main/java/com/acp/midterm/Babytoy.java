package com.acp.midterm;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Babytoy extends Toy
{
	int batteryHealth=6;
	
	public int charge(String time) 
	{
        int duration = Integer.parseInt(time);
        int newh = this.batteryHealth + (duration / 15);
        if (newh > 6) 
        {
            System.out.println("Cannot charge beyond capacity");
            newh = 6;
        } 
        else 
        {
        	batteryHealth++;
            System.out.println("Battery charged successfully");
        }
        
        this.batteryHealth = newh;
        return this.batteryHealth;
    }


	    public void play() 
	    {
	        if (batteryHealth < 0) 
	        {
	            batteryHealth--;
	            System.out.println("Battery health reduced to " + batteryHealth);
	        } 
	        else 
	        {
	            System.out.println("Battery health is already 0.");
	        }
	    }
	
	
	
	
}
