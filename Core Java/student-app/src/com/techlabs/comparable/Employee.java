package com.techlabs.comparable;

public class Employee implements Comparable<Employee> {
	private int empId;
	private String name;
	private int age;

	public Employee(int empId, String name, int age) {
		this.empId=empId;
		this.name=name;
		this.age=age;
	}
	@Override
	public int compareTo(Employee emp) {
		if (this.getAge() == emp.getAge())
			return 0;
		else if (this.getAge() > emp.getAge())
			return 1;
		else
			return -1;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public int getEmpId() {
		return empId;
	}

}