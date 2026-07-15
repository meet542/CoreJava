package com.rays.oop.polymorphism.bank;

public class TestBankByArray {

	public static void main(String[] args) {

		Banks[] b = new Banks[3];

		b[0] = new AxisBank();

		b[1] = new IciciBank();

		b[2] = new HdfcBank();
		
		for(int j=0;j<b.length;j++) {
			System.out.println("Bank name : " + b[j].getName());
			System.out.println(b[j].getName() + " interest rate : " + b[j].InterestRate());
			System.out.println();
		}
	}

}
