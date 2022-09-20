package com.springcore.autowiring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowiring1/autoConfig.xml");
//		Address address = context.getBean("address" , Address.class);
//		System.out.println(address);
		
		Employee emp = context.getBean("employee" , Employee.class);
		System.out.println(emp);
	}
}
