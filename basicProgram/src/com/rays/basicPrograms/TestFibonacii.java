package com.rays.basicPrograms;

public class TestFibonacii {
	public static void main(String[] args) {
		int k = 30;
		int a = 0;
		int b = 1;
		int c;

		System.out.print(a + " ");
		System.out.print(b + " ");
		
		for (int i = 0; i < k; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
}
