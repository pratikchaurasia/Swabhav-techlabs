package com.techlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.model.Student;
import com.techlabs.repository.StudentRepository;

@Service("studentSVC")
public class StudentService {
	@Autowired
	private StudentRepository repo=null;
	
	public StudentService(){
		System.out.println("Service Created");
	}
	
	public List<Student> getStudents(){
		return this.repo.get();
	}
}
