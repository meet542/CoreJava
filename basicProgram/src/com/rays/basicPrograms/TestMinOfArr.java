package com.rays.basicPrograms;
public class TestMinOfArr {
	public static void main(String[] args) {
		int[] arr = { -1, 20, 46, -32, 72, 89, 49, 0, 55 };
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}

}
