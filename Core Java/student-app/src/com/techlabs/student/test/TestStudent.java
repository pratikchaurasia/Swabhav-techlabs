package com.techlabs.student.test;

import java.io.IOException;

import com.techlabs.student.Student;

public class TestStudent {

	public static void main(String args[]) throws ClassNotFoundException, IOException {
		Student student=new Student();
		student.menu();
	}
}
