package com.acp.week13.models;

public class Login {
	private String email;
	private String pass;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		System.out.println("inside email setter: "+email);
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		System.out.println("inside setter"+pass);
		this.pass = pass;
	}
}
