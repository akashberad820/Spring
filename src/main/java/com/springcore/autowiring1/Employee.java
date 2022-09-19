package com.springcore.autowiring1;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	//Place 01
	private Address address;

	public Address getAddress() {
		return address;
	}

	//Place 02
	public void setAddress(Address address) {
		this.address = address;
	}

	//Place 03
	@Autowired
	public Employee(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
