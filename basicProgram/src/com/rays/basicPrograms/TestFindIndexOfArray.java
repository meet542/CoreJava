package com.rays.basicPrograms;

public class TestFindIndexOfArray {
	public static void main(String[] args) {
		int[] arr = { -1, 20, 46, -32, 72, 89, 49, 0, 55 };
		int target = -1;
		int index = 0;
		boolean present = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				present = true;
				index = i;
				break;
			}
		}
		if (present) {
			System.out.println(target + " present at " + index + " index");
		} else {
			System.out.println(target + " not present in arr");
		}
	}
}
