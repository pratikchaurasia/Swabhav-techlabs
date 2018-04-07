package com.techlabs.employee.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

import com.techlabs.employee.Employee;
import com.techlabs.loader.FileLoader;
import com.techlabs.loader.WebLoader;
import com.techlabs.parser.CsvParser;

public class CsvTester {
	
	public static void main(String args[]) throws FileNotFoundException, IOException{
		HashSet<Employee> emp=new HashSet<Employee>();
		CsvParser parser =new CsvParser(new FileLoader());
		emp=parser.parser();
		for(Employee e:emp){
			System.out.println(e.getEmployeeId());
		}
	}
}
