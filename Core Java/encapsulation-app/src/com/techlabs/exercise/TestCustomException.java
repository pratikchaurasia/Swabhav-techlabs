package com.techlabs.exercise;

import java.util.Scanner;

public class TestCustomException {
	static void validate(int age) {
		if (age < 18)
			throw new InvalidAgeException();
		else
			System.out.println("valid Candidate");
	}

	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		validate(input.nextInt());
		}
	}

