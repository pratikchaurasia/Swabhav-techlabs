package com.techlabs.builder;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.techlabs.employee.Employee;

public class DisplayOrganizationalHeirarchy {

	//String parseContent = "\n";


	public void printReportees(Employee employee, int level) {
		for (Employee emp : employee.getReportees()) {
			System.out.println(String.format("%" + level + "s",
					emp.getEmployeeName()));
			printReportees(emp, level + 10);
		}
	}

	public void display(OrganizationBuilder builder) throws FileNotFoundException, IOException {
		Employee CEO = 	builder.getCEO();
		System.out.println(CEO.getEmployeeName());
		printReportees(CEO, 10);
		
	}
}
