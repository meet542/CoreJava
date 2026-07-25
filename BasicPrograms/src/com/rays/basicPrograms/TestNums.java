//Count the Number of Steps to Reduce a Number to Zero 
//or
//Count Operations to Make a Number Zero

package com.rays.basicPrograms;

public class TestNums {
	public static void main(String args[]) {

		int number = 12;
		int count = 0;

		while (number != 0) {

			if (number % 2 == 0) {
				number /= 2;
			}

			else {
				number -= 1;
			}
			count++;

		}

		System.out.println(count);
	}
}
