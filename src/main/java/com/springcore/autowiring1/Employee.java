package com.springcore.autowiring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	//Place 01

	private Address address;

	public Address getAddress() {
		return address;
	}

	//Place 02
	@Autowired
	@Qualifier("address2")
	public void setAddress(Address address) {
		this.address = address;
	}

	//Place 03
	
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
