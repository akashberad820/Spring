package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
		Employee emp = context.getBean("employee" , Employee.class);
		System.out.println(emp);
	}
}
