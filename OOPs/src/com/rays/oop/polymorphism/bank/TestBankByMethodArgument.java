package com.rays.oop.polymorphism.bank;

public class TestBankByMethodArgument {
	
	public static void main(String[] args) {
		Banks[] b = new Banks[3];
		
		b[0] = new AxisBank();
		b[1] = new IciciBank();
		b[2] = new HdfcBank();
		
		loanInquiry(b);
	}
	
	static void loanInquiry(Banks[] banks) {
		for(Banks b : banks) {
			System.out.println("Bank name : " + b.getName());
			System.out.println(b.getName() + " interest rate : " + b.InterestRate());
			System.out.println();
		}
	}
}
