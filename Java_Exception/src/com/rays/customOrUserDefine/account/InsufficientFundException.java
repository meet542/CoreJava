package com.rays.customOrUserDefine.account;

public class InsufficientFundException extends RuntimeException{
	
	public InsufficientFundException() {
		super("Insufficient fund transfer!!");
	}
}
