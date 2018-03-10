package com.techlab.proffesor;

import com.techlab.person.Person;

public class Professor extends Person implements ISalariedEmployee {

	private double salary, basicSalary;
	private double hra = 0.2;

	public Professor(String name, String address, String dob, double basicSalary) {
		super(name, address, dob);
		this.basicSalary = basicSalary;
	}

	public double calculateSalary() {
		salary = basicSalary - (basicSalary * hra);
		return salary;
	}

}