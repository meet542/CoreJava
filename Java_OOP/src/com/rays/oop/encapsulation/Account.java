package com.rays.oop.encapsulation;

public class Account {
	
	private String number;
	private String accountType;
	private double balance;
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposite(double amt) {
		balance += amt;
		System.out.println("Total balance after deposite: " + balance);
	}
	
	public void withdrawal(double amt) {
		if(amt > balance) {
			System.out.println("insufficient balance!!");
		}
		else {
			balance -= amt;
			System.out.println("Total balance after withdrawal: " + balance);
		}
	}
	
	
//	public static void main(String[] args) {
//		
//		Account acc = new Account();
//		
//		acc.setNumber("100");
//		System.out.println("Account number: " + acc.getNumber());
//		
//		acc.setAccountType("credit");
//		System.out.println("Account type: " + acc.getAccountType());
//		
//		acc.setBalance(10000);
//		System.out.println("Total Balance: " + acc.getBalance());
//		
//		acc.withdrawal(1000);
//		
//		acc.deposite(1000);
//	}

}
