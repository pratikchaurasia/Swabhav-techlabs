package com.techlabs.exercise;

public class Student {
	private String fName = "Pratik";
	private String mName = "Satish";
	private String lName = "Chaurasia";
	private String address = "Holi Bazar Vasai(W) Dist-Palghar PIN-401201";
	private String email = "pratikchaurasia632@gmail.com";
	private String dob = "8th November 1996";
	private String moblieNo = "7507587701";


	public String buildResume() {
		String resume=fName+" "+mName+" "+lName+"\n"+address+"\n"+email+"\n"+dob+"\n"+moblieNo;
		return resume;


	}
}
