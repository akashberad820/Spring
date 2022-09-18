package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionConfig.xml");
		Employee emp1 = (Employee) context.getBean("emp1");
		System.out.println(emp1.getEmpName());
		System.out.println(emp1.getEmpContact());
		
		System.out.println(emp1.getEmpAddress());
		System.out.println(emp1.getCourse());
	}

}
