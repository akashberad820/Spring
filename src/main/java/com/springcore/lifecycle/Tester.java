package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
//		Bike b = (Bike) context.getBean("bike1");
//		System.out.println(b);
		context.registerShutdownHook();
//		
//		Car c = (Car) context.getBean("c1");
//		System.out.println(c);

		Helmet h = (Helmet) context.getBean("h");
		System.out.println(h);
		

	}
}
