package com.techlabs.array;

public class TestOveload {
	private static void print() {
		System.out.println("- - - - - - -");
	}

	private static void print(int number) {
		System.out.println(number + " " + number + " " + number);
	}

	private static void print(char character) {
		System.out.println(character + " " + character + " " + character);
	}

	private static void print(double doub) {
		System.out.println(doub + " " + doub + " " + doub);
		System.out.println("You are in double");
	}

	private static void print(float floa) {
		System.out.println(floa + " " + floa + " " + floa);
		System.out.println("You are in float");
	}

	public static void main(String args[]) {
		print();
		print(5);
		print('#');
		print(1.1);
		print(1.555f);
	}

}
