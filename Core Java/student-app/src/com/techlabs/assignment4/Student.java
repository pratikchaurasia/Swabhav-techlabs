package com.techlabs.assignment4;

public class Student {
	private String name;
	private int roll_no;
	private static  int mark1;
	private static int mark2;
	
	public Student(String name, int roll, int marks1, int marks2)
	{
		this.name=name;
		roll_no=roll;
		mark1 = marks1;
		mark2 = marks2;
	}
	public void display()
	{
		System.out.println ("Name of Student: "+name);
		System.out.println ("Roll No. of Student: "+roll_no);
		System.out.println ("Marks of Subject 1: "+getMark1());
		System.out.println ("Marks of Subject 2: "+getMark2());
	}
	public static int getMark1() {
		return mark1;
	}
	
	public static int getMark2() {
		return mark2;
	}
}
