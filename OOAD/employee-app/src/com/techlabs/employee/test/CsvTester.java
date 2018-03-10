package com.techlabs.employee.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import com.techlabs.employee.Employee;
import com.techlabs.loader.FileLoader;
import com.techlabs.parser.CsvParser;

public class CsvTester {
	
	public static void main(String args[]) throws FileNotFoundException, IOException{
		ArrayList<Employee> emp=new ArrayList<Employee>();
		CsvParser parser =new CsvParser(new FileLoader());
		emp=parser.parser();
		for(Employee e:emp){
			System.out.println(e.getEmployeeId());
		}
	}
}
