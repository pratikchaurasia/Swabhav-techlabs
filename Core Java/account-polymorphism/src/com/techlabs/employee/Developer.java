package com.techlabs.employee;

public class Developer extends Employee {
	public Developer(int empNo, String name, double basic) {
		super(empNo, name, basic);
	}

	private double perks;
	
	public double calculateNetSalary() {
		return(.3*basic+basic);
	}

}
