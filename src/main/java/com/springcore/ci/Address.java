package com.springcore.ci;

public class Address {

	private int doorNo;
	private String street;
	private String city;
	
	
	public Address(int doorNo, String street, String city) {
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", street=" + street + ", city=" + city + "]";
	}

	
	
}
