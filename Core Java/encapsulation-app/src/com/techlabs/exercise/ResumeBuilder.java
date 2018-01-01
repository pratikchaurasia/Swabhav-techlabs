package com.techlabs.exercise;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ResumeBuilder {
	private String name;
	private String address;
	private String email;
	private String dob;
	private String moblieNo;
	

	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setDOB(String dob) {
		this.dob=dob;
	}
	public void setMoblieNo(String mobileNo) {
		this.moblieNo=moblieNo;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public String getEmail(){
		return email;
	}
	public String getDOB(){
		return dob;
	}
	public String getMobileNo(){
		return moblieNo;
	}

	public void buildResume() {
		try {
			String center = "Center";
			FileWriter fileWriter = new FileWriter("temp.html");
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			bufferedWriter
					.write("<html><head><title>Resume</title></head><body>");
			bufferedWriter
					.write("<h1 align=" + center + "><hr>Resume<hr></h1>");
			bufferedWriter.newLine();
			bufferedWriter.write("<b>Name : </b><I>" + getName() + " </I><br>");
			
			bufferedWriter.newLine();
			bufferedWriter.write("<b>Address : </b><I>" + getAddress() + "</I><br>");
			bufferedWriter.newLine();
			bufferedWriter.write("<b>Email : </b><I>" + getEmail() + "</I><br>");
			bufferedWriter.newLine();
			bufferedWriter.write("<b>Date of birth : </b><I>" + getDOB()
					+ "</I><br>");
			
			bufferedWriter.newLine();
			bufferedWriter.write("<b>Moblie Number : </b><I>" + getMobileNo());
			bufferedWriter.newLine();
			bufferedWriter.write("</body></html>");

			bufferedWriter.close();
			File htmlFile = new File("temp.html");
			Desktop.getDesktop().browse(htmlFile.toURI());

		} catch (IOException ex) {
			ex.printStackTrace();

		}
	}
}