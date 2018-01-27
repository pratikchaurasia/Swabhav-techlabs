package com.techlabs.assignment5;

public class Student {
	private String name, address, mobileNo;

	public Student(String name, String address, String moblileNo) {
		this.name = name;
		this.address = address;
		this.mobileNo = moblileNo;
	}

	@Override
	public int hashCode() {
		return (this.name.hashCode() + this.address.hashCode() + this.mobileNo
				.hashCode());
	}

	@Override
	public boolean equals(Object student) {
		Student s = (Student) student;
		return (this.name.equals(s.name) && this.address.equals(s.address) && this.mobileNo
				.equals(s.mobileNo));
	}

}
