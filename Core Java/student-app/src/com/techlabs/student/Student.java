package com.techlabs.student;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	Scanner input = new Scanner(System.in);
	GetStudentDetails studentDetails = new GetStudentDetails();
	PrintStudentDetails printData = new PrintStudentDetails();
	private static ArrayList<GetStudentDetails> studentRecord = new ArrayList<GetStudentDetails>();
	private final String defaultPath = "src//com//techlabs//student//buildresume//";

	public void menu() throws IOException, ClassNotFoundException {
		deserializeObject();
		int valid = 1;
		while (valid != 0) {
			System.out
					.println("Type 'add' to add Students\nType 'display' to Display Student Details\nType 'build resume' to Build Resume\nType 'exit' to Exit\n\nNo of Students are :"
							+ studentRecord.size());
			String response = input.nextLine();
			switch (response) {
			case "add":
				studentRecord = studentDetails.getDetails();
				serializeObject();
				break;

			case "display":
				printData.printDetails(studentRecord);
				break;

			case "build resume":
				buildResume();
				break;
			case "exit":
				valid = 0;
				break;
			default:
				System.out.println("Please Enter Correct Response");
				break;

			}
		}

	}

	public void serializeObject() throws IOException, FileNotFoundException {
		FileOutputStream fileOutput = new FileOutputStream("foo.txt");
		ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
		objectOutput.writeObject(studentRecord);
		objectOutput.close();
	}

	@SuppressWarnings("unchecked")
	public void deserializeObject() throws FileNotFoundException, IOException,
			ClassNotFoundException {
		ObjectInputStream input = new ObjectInputStream(new FileInputStream(
				"foo.txt"));
		studentRecord = (ArrayList<GetStudentDetails>) input.readObject();
		input.close();

	}

	public void buildResume() throws IOException {
		for (GetStudentDetails student : studentRecord) {
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
