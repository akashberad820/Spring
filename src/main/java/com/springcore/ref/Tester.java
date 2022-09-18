package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refConfig.xml");
		Employee emp1 = (Employee) context.getBean("emp1");
		System.out.println(emp1);
		
		Employee emp2 = (Employee) context.getBean("emp2");
		System.out.println(emp2);
	}
}
