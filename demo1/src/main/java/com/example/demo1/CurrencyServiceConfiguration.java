package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "currency")
@Component
public class CurrencyServiceConfiguration {
	//@Autowired
	private String url;
	private String username;
	
	public CurrencyServiceConfiguration() {
		System.out.println("Inside default constructor");
	}
	
	public CurrencyServiceConfiguration(String url, String username) {
		System.out.println("Inside parametrized constructor");
		this.url = url;
		this.username = username;
	}
	public String getUrl() {
		System.out.println("url: "+url);
		return url;
	}
	public void setUrl(String url) {
		System.out.println("setting value: "+url);
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
