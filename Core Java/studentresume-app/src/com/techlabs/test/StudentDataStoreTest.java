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
		
		System.out.println(countBeforeAdding);
		System.out.println(countAfterAdding);
		assertTrue(countBeforeAdding<countAfterAdding);	
	}
	@Test
	public void testSave(){
		int countBeforeSaving;
		
		Student student=new Student();
		countBeforeSaving=store.getList().size();
	}

}
