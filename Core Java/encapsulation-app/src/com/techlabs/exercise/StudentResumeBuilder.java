package com.techlabs.exercise;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StudentResumeBuilder {
	private String name, address, email, moblieNo;
	private final String defaultPath = "src//com//techlabs//exercise//buildresume//";

	StudentResumeBuilder(String name, String address, String email,
			String moblieNo) {
		this.name = name;
		this.address = address;
		this.email = email;	
		this.moblieNo = moblieNo;
	}

	public void buildResume() throws IOException {
		BufferedReader bufferReader = new BufferedReader(new FileReader(
				defaultPath + "resume.html"));
		String currentLine = "", htmlFileContent = "";

		while ((currentLine = bufferReader.readLine()) != null) {
			htmlFileContent = htmlFileContent + currentLine + "\n";
		}

		htmlFileContent = htmlFileContent.replace("$name", name);
		htmlFileContent = htmlFileContent.replace("$address", address);
		htmlFileContent = htmlFileContent.replace("$email", email);
		htmlFileContent = htmlFileContent.replace("$mobileNo", moblieNo);
		String resumeFileName = name.replace(" ", "-") + ".html";
		FileWriter fileWriter = new FileWriter(defaultPath + resumeFileName);
		fileWriter.write(htmlFileContent);
		fileWriter.close();
		bufferReader.close();
		File file= new File(defaultPath + resumeFileName);
		Desktop.getDesktop().browse(file.toURI());
		
	}
}
