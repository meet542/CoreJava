package com.rays.oop.abstraction.person;

public class Businessman extends Person implements Richman, SocialWorker{

	@Override
	public void donation() {
		
		System.out.println("Give donations.");
		
	}
	
	@Override
	public void helpToOthers() {
		
		System.out.println("help others.");
		
	}
	
	@Override
	public void Party() {
		
		System.out.println("party all night.");
		
	}
	
	@Override
	public void earnMoney() {
		
		System.out.println("earn money.");
		
	}
	
}
