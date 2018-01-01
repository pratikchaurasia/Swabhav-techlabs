package com.techlabs.exercise;

import java.util.Scanner;

public class TestResume {
	public static void main(String args[]) {
		ResumeBuilder student = new ResumeBuilder();
		getDetails(student);
		student.buildResume();
	}
	
	public static void getDetails(ResumeBuilder student){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the student Name : ");
		student.setName(scanner.nextLine());
		
		System.out.println("Enter the student Address : ");
		student.setAddress(scanner.nextLine());
		
		System.out.println("Enter the student Email : ");
		student.setEmail(scanner.nextLine());
		
		System.out.println("Enter the student Date of Birth : ");
		student.setDOB(scanner.nextLine());
		
		System.out.println("Enter the student Moblie No : ");
		student.setMoblieNo(scanner.nextLine());
		
	}

}
