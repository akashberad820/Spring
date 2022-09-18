package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/ciConfig.xml");
		Address add1 = (Address) context.getBean("add1");
		System.out.println(add1);

		Address add2 = (Address) context.getBean("add2");
		System.out.println(add2);
		
		Employee emp1 = (Employee) context.getBean("emp1");
		System.out.println(emp1);
		
		Employee emp2 = (Employee) context.getBean("emp2");
		System.out.println(emp2);

		Addition addition1 = (Addition) context.getBean("addition1");
		System.out.println(addition1);
		
		Addition addition2 = (Addition) context.getBean("addition2");
		System.out.println(addition2);
		
		Addition addition3 = (Addition) context.getBean("addition3");
		System.out.println(addition3);
	}
	

}
