package com.springcore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collectionConfig.xml");
		Employee emp = context.getBean("emp" , Employee.class);
		System.out.println(emp);
		System.out.println(emp.getContact().getClass().getName());
		System.out.println(emp.getFriends().getClass().getName());
		System.out.println(emp.getCourse().getClass().getName());
	}

}
