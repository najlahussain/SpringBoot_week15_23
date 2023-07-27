package com.acp.midterm;


import org.springframework.stereotype.Component;


@Component
public class Toddlertoys extends Toy
{
	int batteryHealth=5;

	public Toddlertoys(int batteryHealth) {
		super();
		this.batteryHealth = batteryHealth;
	}

	public Toddlertoys() {
		super();
	}
	
	

	public int charge(String time) 
	{
        int duration = Integer.parseInt(time);
        int newh = this.batteryHealth + (duration / 15);
        if (newh > 5) 
        {
            System.out.println("Cannot charge beyond capacity");
            newh = 5;
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
