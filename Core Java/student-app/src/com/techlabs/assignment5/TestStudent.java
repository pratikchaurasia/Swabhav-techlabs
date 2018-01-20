package com.techlabs.assignment5;

import java.util.HashSet;
import java.util.Set;

public class TestStudent {
	public static void main(String args[]) {
		Student student1=new Student("pratik", "vasai", "7507587701");
		Student student2=student1;
		
		Set<Student> set=new HashSet<Student>();
		set.add(student1);
		set.add(student2);
		
		System.out.println(set.size());
		
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
	}
}
