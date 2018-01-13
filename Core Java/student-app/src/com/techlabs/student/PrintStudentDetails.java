package com.techlabs.student;

public class PrintStudentDetails {

	void printDetails(GetStudentDetails studentDetails, int noOfStudents) {
		for (int i = 0; i < noOfStudents; i++) {
			System.out.println("First Name :" + studentDetails.fName.get(i));
			System.out.println("Last Name :" + studentDetails.lName.get(i));
			System.out.println("Address :" + studentDetails.address.get(i));

		}
	}
}
