package com.techlabs.exercise;


	import java.io.IOException;

	public class ResumeTest {
		public static void main(String args[]) throws IOException {
			StudentResumeBuilder buildResume = new StudentResumeBuilder(
					"Pratik Chaurasia",
					"Andheri",
					"pratikchaurasia@gmail.com",
					"9637089502");
			buildResume.buildResume();
			System.out.println("Successfully Resume built.");
		}
	}
