package com.rays.Strings;

public class TestStringCount {

	public static void main(String[] args) {

		String str = "access";

		for (int i = 0; i < str.length(); i++) {

			int count = 1;

			for (int j = i + 1; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}

			boolean found = false;

			for (int k = 0; k < i; k++) {
				if (str.charAt(i) == str.charAt(k)) {
					found = true;
					break;
				}
			}

			if (!found && count > 1) {
				System.out.println(str.charAt(i) + " = " + count);
			}
		}
	}

}
