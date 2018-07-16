package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.techlabs.model.Student;

@Repository
public class StudentRepository {
	
	public StudentRepository() {
		System.out.println("Repository created");
	}
	
	public List<Student> get(){
		Student s1=new Student();
		s1.setRollNo(1);
		s1.setFirstName("pratik");
		s1.setLastName("Chaurasia");
		s1.setAddress("Vasai");
		
		Student s2=new Student();
		s2.setRollNo(2);
		s2.setFirstName("Prasad");
		s2.setLastName("Patik");
		s2.setAddress("Kalyan");
		
		Student s3=new Student();
		s3.setRollNo(3);
		s3.setFirstName("Beulah");
		s3.setLastName("Alexander");
		s3.setAddress("Malad");
		
		List<Student> studentList=new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		return studentList;
	}
}
