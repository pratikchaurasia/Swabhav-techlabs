package com.techlab.student;


import com.techlab.person.Person;

public class Student extends Person{
	Branch branch;
	
	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Student(String name,String address,String date,Branch branch){
		super(name,address,date);
		this.branch=branch;
	}
	
}