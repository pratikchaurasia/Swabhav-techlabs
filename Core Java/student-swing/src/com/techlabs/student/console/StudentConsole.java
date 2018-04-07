package com.techlabs.student.console;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.techlabs.student.Student;
import com.techlabs.student.StudentDataStore;
import com.techlabs.student.buildresume.StudentUI;

public class StudentConsole {

	StudentUI buildResume = new StudentUI();
	StudentDataStore dataStore = new StudentDataStore();
	Scanner input = new Scanner(System.in);
	private ArrayList<Student> studentRecord;

	public void menu() throws IOException, ClassNotFoundException {
		boolean valid = true;
		studentRecord = dataStore.fetch();

		while (valid != false) {
			studentRecord = dataStore.getList();
			System.out
					.println("Type 'add' to add Students\nType 'display' to Display Student Details\nType 'build resume' to Build Resume\nType 'search' to Search\nType 'remove' to Remove a student\nType 'exit' to Exit\n\nNo of students are :"
							+ dataStore.getList().size());
			String response = input.nextLine();
			switch (response) {
			case "add":
				consoleInput();
				break;

			case "display":
				consoleOutput(studentRecord);
				break;

			case "build resume":
				buildResume.buildResume(studentRecord);
				break;

			case "search":
				System.out.println("Enter the search string ");
				String key = input.nextLine();
				consoleOutput(dataStore.search(key));
				break;

			case "remove":
				System.out.println("Enter the student name");
				String rollNo = input.nextLine();
				dataStore.removeStudent(rollNo);
				break;

			case "exit":
				valid = false;
				dataStore.save();
				break;

			default:
				System.out.println("Please Enter Correct Response");
				break;

			}
		}

	}

	public void consoleInput() throws IOException {
		Student student = new Student();

		System.out.println("Enter The First Name");
		student.setFName(input.nextLine());

		System.out.println("Enter The Last Name");
		student.setLName(input.nextLine());

		System.out.println("Enter The Address");
		student.setAddress(input.nextLine());

		dataStore.add(student);

	}

	public void consoleOutput(Iterable<Student> iterable) {
		for (Student student : iterable) {
			System.out.println("RollNo :" + student.getRollNo());
			System.out.println("First Name :" + student.getfName());
			System.out.println("Last Name :" + student.getlName());
			System.out.println("Address :" + student.getAddress());
			System.out.println();

		}

	}

}
