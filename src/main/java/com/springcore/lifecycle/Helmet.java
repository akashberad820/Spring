package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Helmet {

	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Helmet [color=" + color + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Helmet : Init");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Helmet : Destroy");
	}
	
}
