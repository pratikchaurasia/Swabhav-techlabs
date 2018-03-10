package com.techlabs.loader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileLoader implements ILoadable{
	private final String defaultPath = "C:/Users/win8/Downloads/NPL/spcc/english/CSS/";
	
	public String loadFile() throws IOException{
		BufferedReader bufferReader = new BufferedReader(new FileReader(
				defaultPath + "dataFile.txt"));
		
		String currentLine = "",fileContent="";
		while ((currentLine = bufferReader.readLine()) != null) {
			fileContent=fileContent+currentLine+"/";
		}
		return fileContent;
	
		
	}

}
