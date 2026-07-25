package com.rays.basicPrograms;
public class TestSwapWithoutUsingThirdVariable {
	public static void main(String args[]) {
		int a = 100, b = 20;

//		a = a ^ b;
//		b = b ^ a;
//		a = a ^ b;
		
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a);
		System.out.println(b);
	}

}
