package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car implements InitializingBean, DisposableBean{
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [price=" + price + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Car : Destroy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Car : Init");
		
	}
	
	
	
}
