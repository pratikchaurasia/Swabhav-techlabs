package com.techlabs.adapter;

public class TestSwabhavQ {
	public static void main(String args[]){
		SwabhavQ<Student> q=new SwabhavQ<Student>();
		Student s1=new Student("Pratik","Chaurasia","vasai");
		Student s2=new Student("Krishna","Nadar","Abdheri");
		Student s3=new Student("Ankit","Agawwal","umbergaon");
		
		q.anque(s1);
		q.anque(s2);
		q.anque(s3);
		
		
		//System.out.println(q.deque());
		
		for(Student student:q){
			System.out.println(student);
		}
		
	}
}
