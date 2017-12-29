package com.techlabs.array;

public class TestDomainUsingSubstring {
	public static void main(String args[]) {
		int count = 0;
		int length = args.length;

		while (length > 0) {
			int doubleForwardSlash = args[count].indexOf("//");
			int locationOfQuestion = args[count].indexOf("?");
			System.out.println("Url : " + args[count]);
			System.out.println("Domain Name : "
					+ args[count].substring(doubleForwardSlash + 2,
							locationOfQuestion));

			int firstColon = args[count].indexOf("'");
			int lastColon = args[count].lastIndexOf("'");
			if (firstColon == -1) {
				System.out.println("No student name present");
			} else {
				System.out.println("Student Name : "
						+ args[count].substring(firstColon + 1, lastColon)
						+ "\n");
			}

			count++;
			length--;
		}
	}
}
