package com.rays.basicPrograms;

public class TestGenerateHarmonicSeries {
	public static void main(String[] args) {
		int num = 9;

			System.out.print(1);
			if(num!=1) {
				System.out.print(" + ");
			}

		for (int i = 2; i <= num; i++) {
			System.out.print(1 + "/" + i);
			if(i != num) {
				System.out.print(" + ");
			}
		}
	}
}
