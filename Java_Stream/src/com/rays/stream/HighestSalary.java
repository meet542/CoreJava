package com.rays.stream;

import java.util.ArrayList;
import java.util.Comparator;


public class HighestSalary {
	public static void main(String[] args) {
	
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1000);
		list.add(5000);
		list.add(2000);
		list.add(4000);
		list.add(3000);
		
		System.out.println("Salary List:");
		System.out.println(list);
		System.out.println();
		
		//Highest Salary
		System.out.println("Highest Salary:");
		list.stream().sorted(Comparator.reverseOrder()).distinct().limit(1).forEach(System.out::println);
		
		//Second Highest Salary
		System.out.println("Lowest Salary:");
		list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).limit(1).forEach(System.out::println);
	}
	
}
