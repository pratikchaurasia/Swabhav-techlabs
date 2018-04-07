package com.techlabs.student;

public class StudentNotFoundException extends RuntimeException{
	public String getMessage(){
		return("No Student found");
	}
}
