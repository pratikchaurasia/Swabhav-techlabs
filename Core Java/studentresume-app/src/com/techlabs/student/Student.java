package com.techlabs.student;

import java.io.Serializable;
import java.util.UUID;

public class Student implements Serializable {
	private String fName, lName, address;
	private UUID rollNo;

	public Student() {
		rollNo = UUID.randomUUID();
	}

	public UUID getRollNo() {
		return rollNo;
	}

	public void setFName(String firstName) {
		fName = firstName;
	}

	public void setLName(String lastName) {
		lName = lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public String getAddress() {
		return address;
	}

}
