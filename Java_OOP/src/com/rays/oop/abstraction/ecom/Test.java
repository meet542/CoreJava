package com.rays.oop.abstraction.ecom;

public class Test {

	public static void main(String[] args) {

		Light l = new WebApp();// interface ka object banane ke liye uska reference dena padta he jisne usski methods ko complete kia

		l.lightTheme();

		System.out.println("------------------------");

		Dark d = new WebApp();

		d.darkTheme();

	}

}
