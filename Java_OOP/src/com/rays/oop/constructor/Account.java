package com.rays.oop.constructor;

public class Account {

	private String accountNo;
	private String accountType;
	private double accountBalance;

	public Account(String accountNo, String accountType, double accountBalance) {
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.accountBalance = accountBalance;

	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public String getAccountType() {
		return this.accountType;
	}

	public double getAccountBalance() {
		return this.accountBalance;
	}

}
