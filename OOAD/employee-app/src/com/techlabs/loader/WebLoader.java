package com.techlabs.loader;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class WebLoader implements ILoadable{
	URL urlReader;
	BufferedReader bufferReader;
	private final String url = "https://swabhav-tech.firebaseapp.com/emp.txt";

	@Override
	public String loadFile() throws FileNotFoundException, IOException {
		urlReader=new URL(url);
		bufferReader = new BufferedReader(new InputStreamReader(urlReader.openStream()));
		
		String currentLine = "",fileContent="";
		while ((currentLine = bufferReader.readLine()) != null) {
			fileContent=fileContent+currentLine+"/";
		}
		return fileContent;
	}
	
	
}
