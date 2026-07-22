package com.rays.exception;

public class TestNullPointerException {
	
	public static void main(String[] args) {
	
		String name = null;
		
		try {
			
			System.out.println("length of name : " + name.length());
			
		} catch (Exception e) {
			
//			System.out.println("Exeption : " + e.getMessage());
			e.printStackTrace();
			
		}
		
	}
	
}
