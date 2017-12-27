package com.techlabs.array;

public class Domain {
public static void main (String args[]) throws java.util.regex.PatternSyntaxException {
	String s1="https://www.swabhavtechlabs.com?student='Brijesh'";
	String dom[]=s1.split("//",2);
	String domain[]=dom[1].split("\\?",2);
	System.out.println(domain[0]);
	
	String student[]=s1.split("'",3);
	System.out.println(student[1]);
}
}
