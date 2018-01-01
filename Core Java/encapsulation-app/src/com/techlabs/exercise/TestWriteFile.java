package com.techlabs.exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestWriteFile {
	public static void main(String args[]) {
		
        try {
            FileWriter fileWriter =
                new FileWriter("temp.txt");

            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            bufferedWriter.write("Hello there,");
            bufferedWriter.write(" here is some text.");
            bufferedWriter.newLine();
            bufferedWriter.write("We are writing");
            bufferedWriter.write(" the text to the file.");

            bufferedWriter.close();
        }
        catch(IOException ex) {
        	ex.printStackTrace();

        }
		
	}
}
