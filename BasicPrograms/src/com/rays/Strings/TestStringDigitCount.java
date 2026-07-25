package com.rays.Strings;

public class TestStringDigitCount {

	public static void main(String[] args) {
		String s = "Ram123Hello";
		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (Character.isDigit(ch)) {
				count++;
			}
		}
		System.out.println(count);

		count = 0;
		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (!Character.isDigit(ch)) {
				System.out.print(ch);

			}
		}

	}

}
