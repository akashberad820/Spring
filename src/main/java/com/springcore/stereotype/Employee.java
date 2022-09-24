package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emp")
@Scope("prototype")
public class Employee {

	@Value("Akash Berad")
	private String name;

	@Value("8208449595")
	private long contact;

	@Value("#{list}")
	private List<String> course;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public List<String> getCourse() {
		return course;
	}

	public void setCourse(List<String> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", contact=" + contact + ", course=" + course + "]";
	}

}
