package com.techlab.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlab.college.College;
import com.techlab.proffesor.Professor;
import com.techlab.student.Branch;
import com.techlab.student.Student;

public class TestCollege {

	@Test
	public void testAddProfessor() {
		int countBeforeAdding;
		int countAfterAdding;
		College college = new College();
		Professor professor = new Professor("pratik", "vasai", "08/11/1996", 15000);
		countBeforeAdding = college.getAllProfessors().size();

		college.addProfessor(professor);
		countAfterAdding = college.getAllProfessors().size();
		
		assertNotEquals(countBeforeAdding, countAfterAdding);
	}
	public void testAddStudent() {
		int countBeforeAdding;
		int countAfterAdding;
		College college = new College();
		Student student=new Student("pratik", "vasai", "08/11/1996",Branch.IT);
		countBeforeAdding = college.getAllStudents().size();

		college.addStudent(student);
		countAfterAdding = college.getAllStudents().size();
		
		assertNotEquals(countBeforeAdding, countAfterAdding);
	}

}
