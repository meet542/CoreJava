package com.rays.basicPrograms;
public class TestPrintTable {
	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(nums[i]+ " X " + j + " = " + nums[i] * j);
			}
			System.out.println("\t");
		}
	}
}
