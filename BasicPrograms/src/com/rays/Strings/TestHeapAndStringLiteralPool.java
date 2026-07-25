package com.rays.Strings;

public class TestHeapAndStringLiteralPool {

	public static void main(String[] args) {

		// When a String is created using string literal (""),
		// it is stored in the String Pool (String Constant Pool).
		String s1 = "SUNRAYS";
		String s2 = "SUNRAYS";

		// When a String is created using the 'new' keyword,
		// a new String object is created in the heap memory.
		String s3 = new String("Welcome");
		String s4 = new String("Welcome");

		System.out.println(s1 == s2);
		// true -> both s1 and s2 refer to the same String object in the String Pool.

		System.out.println(s3 == s4);
		// false -> s3 and s4 refer to two different String objects in the heap.
	}

}
