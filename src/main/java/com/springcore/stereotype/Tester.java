package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;

public class Tester {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
		Employee emp = context.getBean("emp", Employee.class);
		System.out.println(emp);
		System.out.println(emp.getCourse().getClass().getName());
	}
}
