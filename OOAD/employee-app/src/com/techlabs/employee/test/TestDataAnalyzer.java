package com.techlabs.employee.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.techlabs.employee.DataAnalyser;
import com.techlabs.employee.Employee;
import com.techlabs.loader.FileLoader;
import com.techlabs.parser.CsvParser;

public class TestDataAnalyzer {	
	
	
	public static void main(String args[]) throws FileNotFoundException, IOException{
		DataAnalyser analyser=new DataAnalyser(new CsvParser(new FileLoader()));
		Employee emp=analyser.getMaxSalary();
		System.out.println(emp.getEmployeeName());
	}
}