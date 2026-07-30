package com.rays.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {
			
		Employee e1 = new Employee("Akshara", 4, "Wipro", 10000);
		Employee e2 = new Employee("Akash", 2, "TCS", 10000);
		Employee e3 = new Employee("Rohan", 1, "Infosys", 10000);
		Employee e4 = new Employee("Kunal", 3, "NCS" , 10000);
		Employee e5 = new Employee("Soham", 5, "Adobe" , 10000);
		
		List <Employee> list = new ArrayList<>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		list.forEach(System.out::println);
		
		Collections.sort(list);
		
		System.out.println("-----------------------------------------------------");
		
		list.forEach(System.out::println);
	}
}
