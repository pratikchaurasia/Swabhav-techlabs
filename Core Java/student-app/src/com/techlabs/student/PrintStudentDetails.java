package com.techlabs.student;

import java.util.ArrayList;

public class PrintStudentDetails {

	void printDetails(ArrayList<GetStudentDetails> studentRecord) {
		for (GetStudentDetails student : studentRecord) { 
			System.out.println("First Name :" + student.getfName());
			System.out.println("Last Name :" + student.getlName());
			System.out.println("Address :" + student.getAddress());
			System.out.println();

		}
	}
}
 