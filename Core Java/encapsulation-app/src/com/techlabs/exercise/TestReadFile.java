package com.techlabs.exercise;

import java.io.*;

public class TestReadFile {
	public static void main(String arga[]) throws IOException {
		String line = null;

		try {
			FileReader fileReader = new FileReader("temp.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			bufferedReader.close();
			
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}