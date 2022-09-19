package com.springcore.autowiring;

public class Address {

	private String City;

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public Address(String city) {
		City = city;
	}

	@Override
	public String toString() {
		return "Address [City=" + City + "]";
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
