package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee {

//	@Value("#{ 1000+24.50 }")
//	private double salary;

	@Value("#{ 100>50 ? 500:1000 }")
	private double salary;

	@Value("#{ T(java.lang.Math).sqrt(144) }")
	private int x;
	
	@Value("#{ T(java.lang.Math).PI }")
	private double y;
	
	@Value("100")
	private int z;

	@Value("#{ 8>3 }")
	private boolean isActive;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", x=" + x + ", y=" + y + ", z=" + z + ", isActive=" + isActive + "]";
	}



}
