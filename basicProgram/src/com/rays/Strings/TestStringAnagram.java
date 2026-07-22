package com.rays.Strings;

import java.util.Arrays;

public class TestStringAnagram {

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";

		if (s1.length() != s2.length()) {
			System.out.println("Not Anagram");
		}

//		This line converts the String into a character array (char[]
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();

		Arrays.sort(a1);
		Arrays.sort(a2);

		if (Arrays.equals(a1, a2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}

	}

}
