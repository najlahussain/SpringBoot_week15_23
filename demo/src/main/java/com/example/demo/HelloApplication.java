package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con = SpringApplication.run(HelloApplication.class, args);
		
		//Alien a = con.getBean(Alien.class);
		//a.show();
	}

}
