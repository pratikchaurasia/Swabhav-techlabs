package com.techlabs.exercise;

public class TestDomainUsingSplit {
	public static void main(String args[]){
		//String url = "https://www.swabhavtechlabs.com?student='Brijesh'";
		String url = "https://www.yahoo.com?student='pratik'";
		String dom[] = url.split("//", 2);
		String domain[] = dom[1].split("\\?", 2);
		System.out.println(domain[0]);

		String student[] = url.split("'", 3);
		System.out.println(student[1]);
	}
}
