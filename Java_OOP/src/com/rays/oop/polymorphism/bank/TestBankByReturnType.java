package com.rays.oop.polymorphism.bank;

public class TestBankByReturnType {
	public static void main(String[] args) {
		
		Banks[] b = new Banks[3];
		
		b[0] = Banks.getBanks(1);
		b[1] = Banks.getBanks(2);
		b[2] = Banks.getBanks(3);
		
		System.out.println("Bank name : " + b[0].getName());
		System.out.println(b[0].getName() + " interest rate : " + b[0].InterestRate());
		System.out.println();
		
		System.out.println("Bank name : " + b[1].getName());
		System.out.println(b[1].getName() + " interest rate : " + b[1].InterestRate());
		System.out.println();
		
		System.out.println("Bank name : " + b[2].getName());
		System.out.println(b[2].getName() + " interest rate : " + b[2].InterestRate());
		System.out.println();
	}
}
