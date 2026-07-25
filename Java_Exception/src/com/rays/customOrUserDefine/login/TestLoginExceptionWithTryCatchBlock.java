package com.rays.customOrUserDefine.login;

public class TestLoginExceptionWithTryCatchBlock {

	public static void main(String[] args) {
		String login = "admin123";

		try {

			if (login.equals("admin")) {
				System.out.println("user found.");
			} else {
				throw new LoginException();

			}
		} catch (LoginException e) {
			System.out.println("Invalid credentials");
		}
		
		//here exception is handeled here itself with help of try catch block so no need to propogate exception
	}
}
