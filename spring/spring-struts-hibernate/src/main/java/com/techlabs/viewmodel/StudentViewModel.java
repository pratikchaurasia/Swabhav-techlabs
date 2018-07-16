package com.techlabs.viewmodel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.techlabs.entity.Student;



public class StudentViewModel {
	private List<Student> studentList;
	
	
	

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	

	
	
}
