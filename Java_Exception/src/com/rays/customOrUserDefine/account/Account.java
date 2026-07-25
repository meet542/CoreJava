package com.rays.customOrUserDefine.account;

public class Account {
	
	public Account() {
		
	}
	
	private double balance;
	
	public Account(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double amount) {
		if(amount > balance) {
			throw new InsufficientFundException();
		}
		else {
			System.out.println("Balance Before withdraw : " + balance);
			balance -= amount;
			System.out.println("Amount withdrawed : " + amount);
			System.out.println("New Balance : " + balance);
		}
	}

}
