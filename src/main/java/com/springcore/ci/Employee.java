package com.springcore.ci;

public class Employee {

	private String empId;
	private String empName;
	private long contactNumber;
	private Address address;


	public Employee(String empId, String empName, long contactNumber, Address address) {
		
		this.empId = empId;
		this.empName = empName;
		this.contactNumber = contactNumber;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", contactNumber=" + contactNumber + ", address="
				+ address + "]";
	}
			
}
