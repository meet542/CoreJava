package com.rays.Strings;

public class TestSubString {

	public static void main(String[] args) {
		String s = "ujlujl";
		// If string is "abcdef" then it will print 6 different characters.

		int count = 0;
		int c = 0;

		for (char i = 'a'; i <= 'z'; i++) {

			for (int j = 0; j <= s.length() - 1; j++) {

				if (i == s.charAt(j)) {

					System.out.println(i + " " + s.charAt(j));
					count++;
				}
			}

			if (count > 0) {
				System.out.println(i + " = " + count);
				count = 0; // reset counter for other characters
				c++;
			}
		}

		System.out.println(c);
	}
	
}
