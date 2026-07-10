package com.rays.basicPrograms;
public class TestPrimeOrNot {
	public static void main(String[] args) {
		int number = 8;
		boolean prime = true;
		
		for(int i=2;i<number;i++) {
			if(number % i == 0) {
				prime = false;
			}
		}
		
		if(prime) {
			System.out.println(number + " is Prime.");
		}
		else {
			System.out.println(number + " is not Prime.");
		}
	}
}
