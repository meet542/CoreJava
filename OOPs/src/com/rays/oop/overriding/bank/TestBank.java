package com.rays.oop.overriding.bank;
public class TestBank {
	public static void main(String[] args) {
		
		System.out.println("========RBI Bank========");
		Bank b= new Bank();
		System.out.println("Bank name : " + b.getName());
		System.out.println(b.getName() + " interest : " + b.interestRate());
		System.out.println();
		
		System.out.println("=======Axix Bank========");
		AxisBank a = new AxisBank();
		
		System.out.println("Bank name : " + a.getName());
		System.out.println(a.getName() + " interest : " + a.interestRate());
		System.out.println();
		
		
		System.out.println("=======ICICI Bank========");
		IciciBank i = new IciciBank();
		
		System.out.println("Bank name : " + i.getName());
		System.out.println(i.getName() + " interest : " + i.interestRate());
		System.out.println();
		
		System.out.println("========SBI Bank========");
		SbiBank s = new SbiBank();
		
		System.out.println("Bank name : " + s.getName());
		System.out.println(s.getName() + " interest : " + s.interestRate());
	}

}
