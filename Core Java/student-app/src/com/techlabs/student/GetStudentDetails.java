package com.techlabs.student;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStudentDetails {
	Scanner input = new Scanner(System.in);
	ArrayList<String> fName = new ArrayList<String>();
	ArrayList<String> lName = new ArrayList<String>();
	ArrayList<String> address = new ArrayList<String>();

	void getDetails() {
		System.out.println("Enter The First Name");
		fName.add(input.nextLine());

		System.out.println("Enter The Last Name");
		lName.add(input.nextLine());

		System.out.println("Enter The Address");
		address.add(input.nextLine());
	}

}
