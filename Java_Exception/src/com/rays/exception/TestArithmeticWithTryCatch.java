package com.rays.exception;

public class TestArithmeticWithTryCatch {
	public static void main(String[] args) {

		int a = 0;
		int b = 10;

		try {

			int div = b / a;
			System.out.println(div);

		} catch (ArithmeticException e) {
			System.out.println("Exception : " + e.getMessage());
		}
		System.out.println("Program is finished.");
	}
}
