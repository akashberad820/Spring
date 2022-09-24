package com.springcore.annoBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {

//		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/annoBean/config.xml");
//		Student student = context.getBean("student", Student.class);
//		System.out.println(student);
		
//		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
//		Student s = context.getBean("student" , Student.class);
//		System.out.println(s);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student s = context.getBean("getStudent" , Student.class);
		System.out.println(s);
		

	}

}
