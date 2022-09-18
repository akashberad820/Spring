package com.springcore.lifecycle;

public class Bike {

	private String company;
	private String Model;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	
	@Override
	public String toString() {
		return "Bike [company=" + company + ", Model=" + Model + "]";
	}
	
	public void init() {
		System.out.println("Inside Init Method");
	}
	
	public void destroy() {
		System.out.println("Inside Destroy Method");
	}
	
}
