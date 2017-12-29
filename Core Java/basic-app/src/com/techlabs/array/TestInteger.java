package com.techlabs.array;

public class TestInteger {
	public static void main(String[] args) {
		int mark = 100;
		changeMark(mark);
		System.out.println(mark);

		int[] marks = { 10, 20, 30, 40 };
		changeMarks(marks);
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}

	}
	static void changeMark(int markparam) {
	}

	static void changeMarks(int[] marksparam) {
		for (int i = 0; i < marksparam.length; i++) {
			marksparam[i] = 0;
		}
	}

}
