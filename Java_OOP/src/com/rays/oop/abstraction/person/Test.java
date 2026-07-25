package com.rays.oop.abstraction.person;

public class Test {
	
	public static void main(String[] args) {
	
		SocialWorker s = new Businessman();
		
		s.helpToOthers();
		
		
		Richman r = new Richman() {
			
			@Override
			public void earnMoney() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void donation() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void Party() {
				// TODO Auto-generated method stub
				
			}
		};
		
	}
	
}
