package com.techlabs.employee.test;

import java.io.IOException;

import com.techlabs.loader.WebLoader;

public class TestWebLoader {
	public static void main(String args[]) throws IOException{
		WebLoader loader=new WebLoader();
		String content=loader.loadFile();
		System.out.println(content);
	}
}
