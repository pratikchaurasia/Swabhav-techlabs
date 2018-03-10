package com.techlabs.employee.test;


import java.io.IOException;

import com.techlabs.loader.FileLoader;

public class TestFileLoader {
	public static void main(String args[]) throws IOException{
		FileLoader loader=new FileLoader();
		String content=loader.loadFile();
		System.out.println(content);
	}
}
