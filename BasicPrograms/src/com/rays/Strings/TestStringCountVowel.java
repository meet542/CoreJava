package com.rays.Strings;

public class TestStringCountVowel {

	public static void main(String[] args) {
		String t = "I am Happiee";
		int Count = 0;

		for (int i = 0; i < t.length(); i++) {

			char ch = t.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {

				Count++;
			}
		}
		System.out.println("Number of Vowels in string " + "(" + t + ") = " + Count);

	}

}
