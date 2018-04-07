package com.techlabs.parser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

import com.techlabs.employee.Employee;
import com.techlabs.loader.FileLoader;
import com.techlabs.loader.ILoadable;
import com.techlabs.loader.WebLoader;


public class CsvParser {
	BufferedReader reader;
	ILoadable load;
	HashSet<Employee> hashEmpList = new HashSet<Employee>();
	FileLoader loader;
	String isNull="NULL";
	
	public CsvParser(FileLoader loader){
		this.loader=loader;
	}
	
	public HashSet<Employee> parser() throws FileNotFoundException, IOException{
		String fileContent=loader.loadFile();
		String employee[]=fileContent.split("/");
		
		for(int i=0;i<employee.length;i++){
			String content[]=employee[i].split(",");
			if(content[3].equals(isNull)){
				content[3]="0";
			}
			if(content[6].equals(isNull)){
				content[6]="0";
			}
			
			hashEmpList.add(new Employee(Integer.parseInt(content[0]), content[1], content[2],Integer.parseInt(content[3]),content[4], Integer.parseInt(content[5]), Integer.parseInt(content[6]),Integer.parseInt(content[7])));
			}	
		return hashEmpList;
		
	}
}
