package com.techlabs.student.buildresume;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.techlabs.student.Student;
import com.techlabs.student.StudentDataStore;

public class StudentUI {
	private final String defaultPath = "src//com//techlabs//student//buildresume//";
	StudentDataStore dataStore=new StudentDataStore();

	public void buildResume(ArrayList<Student> studentRecord) throws IOException {
		for (Student student : studentRecord) {
			BufferedReader bufferReader = new BufferedReader(new FileReader(
					defaultPath + "resume.html"));
			String currentLine = "", htmlFileContent = "";

			while ((currentLine = bufferReader.readLine()) != null) {
				htmlFileContent = htmlFileContent + currentLine + "\n";
			}

			htmlFileContent = htmlFileContent.replace("$fName",
					student.getfName());
			htmlFileContent = htmlFileContent.replace("$lName",
					student.getlName());
			htmlFileContent = htmlFileContent.replace("$address",
					student.getAddress());
			String resumeFileName = student.getfName() + ".html";
			FileWriter fileWriter = new FileWriter(defaultPath + resumeFileName);
			fileWriter.write(htmlFileContent);
			fileWriter.close();
			bufferReader.close();
			File file = new File(defaultPath + resumeFileName);
			Desktop.getDesktop().browse(file.toURI());
		}
	}
}
 