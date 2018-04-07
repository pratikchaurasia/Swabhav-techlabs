package com.techlabs.test;

import java.io.IOException;

import com.techlabs.student.console.StudentConsole;

public class TestStudent {

	public static void main(String args[]) throws ClassNotFoundException, IOException {
		StudentConsole console=new StudentConsole();
		console.menu();
	}
}