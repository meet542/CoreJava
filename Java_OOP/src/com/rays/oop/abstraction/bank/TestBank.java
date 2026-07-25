package com.rays.oop.abstraction.bank;

public class TestBank {
	public static void main(String[] args) {

		Bank b1 = new AxisBank();

		System.out.println("Bank name : " + b1.getName());
		System.out.println(b1.getName() + " interest rate : " + b1.interestRate());
		System.out.println();

		Bank b2 = new ICICIBank();

		System.out.println("Bank name : " + b2.getName());
		System.out.println(b2.getName() + " interest rate : " + b2.interestRate());
		System.out.println();

		Bank b3 = new HDFCBank();

		System.out.println("Bank name : " + b3.getName());
		System.out.println(b3.getName() + " interest rate : " + b3.interestRate());
		System.out.println();
	}

}
