package com.rays.basicPrograms;
public class TestSecondLargestNumInArr {
	public static void main(String[] args) {
		
		int[] arr = {0, -1, -2};
		
		//int[] arr = { -1, 20, 46, -32, 72, 89, 49, 0, 55 };
		int largest = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<largest && arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
	     
		System.out.println(secondLargest);
	}

}
