package com.techlabs.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.techlabs.student.Student;
import com.techlabs.student.StudentDataStore;

public class StudentDataStoreTest {
	StudentDataStore store=new StudentDataStore();
	@Test
	public void testAdd() {
		int countBeforeAdding;
		int countAfterAdding;
		
		Student student=new Student();
		countBeforeAdding=store.getList().size();
		
		store.add(student);
		countAfterAdding=store.getList().size();
		
		//System.out.println(countBeforeAdding);
		//System.out.println(countAfterAdding);
		assertTrue(countBeforeAdding<countAfterAdding);	
	}
	public void testRemove() {	
		Student student1=new Student();
		student1.setFName("krishna");
		store.add(student1);
		
		Student student2=new Student();
		student2.setFName("ankit");
		store.add(student2);
		
		store.removeStudent("ankit");
		assertTrue(store.getList().contains(student2));
	
	}
	
}
