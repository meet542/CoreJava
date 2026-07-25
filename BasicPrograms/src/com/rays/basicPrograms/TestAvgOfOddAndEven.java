package com.rays.basicPrograms;

public class TestAvgOfOddAndEven {
	public static void main(String[] args) {
		int N = 12;
		
		int oddCount = N;
		int evenCount = N;
		
		double oddSum = 0d;
		double evenSum = 0d;
		
		int o = 1;

		while (oddCount > 0) {
			oddSum += o;
			o += 2;
			oddCount--;
		}
		
		System.out.println("Average of odd numbers : " + oddSum/N);
		
		System.out.println("------------------------");
		
		int e = 0;
		
		while (evenCount > 0) {
			evenSum += e;
			e += 2;
			evenCount--;
		}
		
		System.out.println("Average of even numbers : " + evenSum/N);
	}

}
