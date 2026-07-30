package com.rays.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheet {
	
	public static void main(String[] args) {
		
		Marksheet m1 = new Marksheet(101, "Ram", 87);
		Marksheet m2 = new Marksheet(105, "Amit", 72);
		Marksheet m3 = new Marksheet(102, "Priya", 95);
		Marksheet m4 = new Marksheet(108, "Neha", 64);
		Marksheet m5 = new Marksheet(103, "Rohan", 81);
		Marksheet m6 = new Marksheet(107, "Anjali", 90);
		
		// Create List object
		List<Marksheet> list = new ArrayList<Marksheet>();

		// Add all objects
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		list.add(m6);
		
		list.forEach(System.out::println);
		
		Collections.sort(list);
		
		System.out.println("----------");
		
		list.forEach(System.out::println);
		
	}

}
