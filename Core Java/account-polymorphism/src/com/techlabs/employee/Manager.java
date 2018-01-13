package com.techlabs.employee;

public class Manager extends Employee {
	public Manager(int empNo, String name, double basic) {
		super(empNo, name, basic);
		
	}

	private double hra;
	private double ta;
	
	public double calculateNetSalary(){
		return(basic+.5*basic+.4*basic);
	}
		

}
