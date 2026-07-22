package com.rays.exception;

public class TestMultipleCatchBlock {

	public static void main(String[] args) {

		String name = null;
		//String name = "Rahul";

		try {

			System.out.println("length of name : " + name.length());
			System.out.println(name.charAt(7));

		} catch (NullPointerException e) {

			System.out.println("exception 1: " + e.getMessage());

		}catch (IndexOutOfBoundsException e) {
			
			System.out.println("excpetion 2: " + e.getMessage());
			
		}

	}

}
