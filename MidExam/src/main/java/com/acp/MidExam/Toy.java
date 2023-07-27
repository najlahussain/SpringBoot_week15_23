package com.acp.MidExam;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public abstract class Toy {
int batteryHealth;

public int getBatteryHealth() {
	return batteryHealth;
}

public abstract int charge(String time);
public void play() {
    batteryHealth = Math.max(0, batteryHealth - 1);
    System.out.println("Playing.........");
    System.out.println("The battery health is "+batteryHealth);
}

}
