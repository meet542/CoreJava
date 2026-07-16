package com.rays.oop.constructor;

public class TestAccount {

	public static void main(String[] args) {
		Account a = new Account("987654388", "saving", 100000);

		System.out.println("Account number : " + a.getAccountNo());
		System.out.println("Account type : " + a.getAccountType());
		System.out.println("Account Balance : " + a.getAccountBalance());
	}

}
