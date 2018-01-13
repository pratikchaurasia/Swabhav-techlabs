package com.techlabs.assignment4;

public class Result extends Student implements Exam{
	Result(String name, int roll, int mark1, int mark2)
	{
		super(name,roll,mark1,mark2);
	}
	public void percentCal()
	{
		int total=(Student.getMark1()+Student.getMark2());
		float percent=total*100/200;
		System.out.println ("Percentage: "+percent+"%");
	}
	public void display()
	{
		super.display();
	}
}
