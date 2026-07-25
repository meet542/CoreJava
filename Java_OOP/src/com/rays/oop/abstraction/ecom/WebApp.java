package com.rays.oop.abstraction.ecom;

public class WebApp extends Ecom implements Light, Dark{
	
	@Override
	public void lightTheme() {
		
		System.out.println("switched to light theme.");
		
	}
	
	@Override
	public void darkTheme() {
		
		System.out.println("switched to dark theme.");
		
	}
}
