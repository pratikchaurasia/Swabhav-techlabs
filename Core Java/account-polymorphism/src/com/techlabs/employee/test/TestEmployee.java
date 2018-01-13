package com.techlabs.employee.test;

import com.techlabs.employee.Developer;
import com.techlabs.employee.Employee;
import com.techlabs.employee.Manager;

public class TestEmployee {
public static void main(String args[]){
	Manager manager=new Manager(100, "Pratik", 5000);
	Developer developer = new Developer(101, "krishna", 2000);
	printDetails(manager);
	printDetails(developer);
	
}
	public static void printDetails(Employee emp){
		System.out.println("Salary is : "+emp.calculateNetSalary());
	}
}
