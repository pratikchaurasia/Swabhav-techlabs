package com.techlabs.student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;

public class GetStudentDetails implements Serializable {
	private static final long serialVersionUID = 1L;
	transient BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	ArrayList<GetStudentDetails> studentRecord = new ArrayList<GetStudentDetails>();
	private String fName, lName, address;

	public ArrayList<GetStudentDetails> getDetails() throws IOException {
		GetStudentDetails student = new GetStudentDetails();

		System.out.println("Enter The First Name");
		student.setFName(input.readLine());

		System.out.println("Enter The Last Name");
		student.setLName(input.readLine());

		System.out.println("Enter The Address");
		student.setAddress(input.readLine());

		studentRecord.add(student);
		return studentRecord;
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
