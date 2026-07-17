package com.rays.oop.polymorphism.bank;

public class TestBank {

	public static void main(String[] args) {

		Banks b1 = new AxisBank(); // agar method child me override hui he to vo child se hi call hogi bhale hi object parent ka bana ho.
		// or AxisBank b1 = new AxisBank();

		System.out.println("Bank name : " + b1.getName()); // yaha par b1 object parent ka he par .getname method child me override hui he to child se hi call hogi
		System.out.println(b1.getName() + " interest rate : " + b1.InterestRate());
		System.out.println();

		Banks b2 = new IciciBank();
		//or IciciBank b2 = new IciciBank();

		System.out.println("Bank name : " + b2.getName());
		System.out.println(b2.getName() + " interest rate : " + b2.InterestRate());
		System.out.println();

		Banks b3 = new HdfcBank();
		//or HdfcBank b3 = new HdfcBank();

		System.out.println("Bank name : " + b3.getName());
		System.out.println(b3.getName() + " interest rate : " + b3.InterestRate());
		System.out.println();
	}

}
