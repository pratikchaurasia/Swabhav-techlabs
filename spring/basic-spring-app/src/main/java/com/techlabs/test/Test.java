package com.techlabs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.service.StudentService;
public class Test {
	public static void main(String args[]){
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService service=context.getBean(StudentService.class);
		System.out.println("Total Students : "+service.getStudents().size());
		System.out.println(service.hashCode());
		
		StudentService service1=context.getBean("studentSVC",StudentService.class);
		System.out.println(service1.hashCode());
	}
}
