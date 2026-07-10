package com.rays.basicPrograms;

public class TestFindMissingNum {
	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] B = { 1, 2, 3, 4, 5, 6, 8, 9 };
		int sumOfA = 0, sumOfB = 0;
		int number;

		for (int i = 0; i < A.length; i++) {
			sumOfA += A[i];
		}

		for (int i = 0; i < B.length; i++) {
			sumOfB += B[i];
		}

		number = sumOfA - sumOfB;

		System.out.println(number);
	}
}
