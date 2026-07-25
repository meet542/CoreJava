package com.rays.basicPrograms;

public class TestFactorial {
	public static void main(String[] args) {
		int number = 6;
		int fact = 1;
		
		for(int i=1;i<=number;i++) {
			fact *= i;
		}
		
		System.out.println("Factorial of " + number + " = " + fact);
	}
}
