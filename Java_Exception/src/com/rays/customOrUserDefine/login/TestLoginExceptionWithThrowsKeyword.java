package com.rays.customOrUserDefine.login;

public class TestLoginExceptionWithThrowsKeyword{
	
	public static void main(String[] args) throws LoginException {
		String login = "admin123";
		
		if(login.equals("admin")){
			System.out.println("user found.");
		}
		else {
			LoginException e = new LoginException();
			throw e;
			//OR
			//throw new LoginException();
			//here exception is not handeled, so it is propogated to called method
		}
	}

}
