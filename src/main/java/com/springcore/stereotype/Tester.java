package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;

public class Tester {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
		Employee emp = context.getBean("emp", Employee.class);
		System.out.println(emp.hashCode());
		
		Employee emp1 = context.getBean("emp", Employee.class);
		System.out.println(emp1.hashCode());
		
		Teacher teacher = context.getBean("teacher" , Teacher.class);
		System.out.println(teacher.hashCode());
		
		Teacher teacher1 = context.getBean("teacher" , Teacher.class);
		System.out.println(teacher1.hashCode());
		
	}
	
}
