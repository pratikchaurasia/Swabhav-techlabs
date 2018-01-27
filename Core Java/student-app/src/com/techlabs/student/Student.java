package com.techlabs.student;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Student{
	Scanner input = new Scanner(System.in);
	StudentStore studentDetails = new StudentStore();
	StudentUI printData = new StudentUI();
	private static ArrayList<StudentStore> studentRecord = new ArrayList<StudentStore>();


	public void menu() throws IOException, ClassNotFoundException {
		studentRecord=studentDetails.deserializeObject(studentRecord);
		int valid = 1;
		while (valid != 0) {
			System.out
					.println("Type 'add' to add Students\nType 'display' to Display Student Details\nType 'build resume' to Build Resume\nType 'exit' to Exit\n\nNo of Students are :"
							+ studentRecord.size());
			String response = input.nextLine();
			switch (response) {
			case "add":
				getDetails();
				studentDetails.serializeObject(studentRecord);
				break;

			case "display":
				printDetails(studentRecord);
				break;

			case "build resume":
				printData.buildResume(studentRecord);
				break;
			case "exit":
				valid = 0;
				break;
			default:
				System.out.println("Please Enter Correct Response");
				break;

			}
		}

	}

	public void getDetails() throws IOException {
		StudentStore student = new StudentStore();

		System.out.println("Enter The First Name");
		student.setFName(input.nextLine());

		System.out.println("Enter The Last Name");
		student.setLName(input.nextLine());

		System.out.println("Enter The Address");
		student.setAddress(input.nextLine());

		studentRecord.add(student);
	}


	void printDetails(ArrayList<StudentStore> studentRecord) {
		for (StudentStore student : studentRecord) {
			System.out.println("First Name :" + student.getfName());
			System.out.println("Last Name :" + student.getlName());
			System.out.println("Address :" + student.getAddress());
			System.out.println();

		}

	}
}
