package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private String empName;
	private List<Long> empContact ;
	private Set<String> empAddress;
	private Map<String , Float> course;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, List<Long> empContact, Set<String> empAddress, Map<String, Float> course) {
		super();
		this.empName = empName;
		this.empContact = empContact;
		this.empAddress = empAddress;
		this.course = course;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<Long> getEmpContact() {
		return empContact;
	}

	public void setEmpContact(List<Long> empContact) {
		this.empContact = empContact;
	}

	public Set<String> getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Set<String> empAddress) {
		this.empAddress = empAddress;
	}

	public Map<String, Float> getCourse() {
		return course;
	}

	public void setCourse(Map<String, Float> course) {
		this.course = course;
	}
	
	
}
