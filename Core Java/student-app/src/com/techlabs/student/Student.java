package com.techlabs.student;
import java.util.Scanner;

public class Student {

	Scanner input = new Scanner(System.in);
	GetStudentDetails studentDetails = new GetStudentDetails();
	PrintStudentDetails printData = new PrintStudentDetails();
	private int noOfStudents = 0;
	
	public void menu() {
		int valid = 1;
		while (valid != 0) {
			System.out
					.println("Enter 1 to add Students\nEnter 2 to Display Student Details\nEnter 0 to Exit\n\nNo of Students are :"
							+ noOfStudents);
			int response = input.nextInt();
			switch (response) {
			case 1:
				noOfStudents++;
				studentDetails.getDetails();
				break;

			case 2:
				printData.printDetails(studentDetails,noOfStudents);
				break;

			case 0:
				valid = 0;
				break;
			default:
				System.out.println("Please Enter Correct Response");
				break;
			}
		}

	}
}
