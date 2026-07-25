package com.rays.Strings;

public class TestStringReverse {

	public static void main(String[] args) {
		String s = "Tanisha";

		String reverse = "";
		
		System.out.println("Original String : " + s);
		
		for (int i = 0; i < s.length(); i++) {
			
			reverse = s.charAt(i) + reverse;
			
		}
		
		System.out.println("Reverse String : " + reverse);
	}

}
