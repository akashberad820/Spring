package com.springcore.annoBean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Student {

	@Value("Akash Berad")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	
}
