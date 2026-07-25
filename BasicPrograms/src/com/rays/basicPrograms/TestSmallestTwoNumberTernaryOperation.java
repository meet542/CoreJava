package com.rays.basicPrograms;

public class TestSmallestTwoNumberTernaryOperation {

	public static void main(String[] args) {
		int a = 145;
		int b = 200;
		int Output;

//   Ternary operator condition =>  (condition) ? value_if_true : value_if_false;
		Output = (a < b) ? a : b;
		System.out.println(Output);
	}

}
