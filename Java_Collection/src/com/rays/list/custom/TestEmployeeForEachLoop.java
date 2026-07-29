package com.rays.list.custom;

import java.util.ArrayList;
import java.util.List;

public class TestEmployeeForEachLoop {

public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		
		Employee e1 = new Employee("Akshara", 1, "Wipro", 10000);
		Employee e2 = new Employee("Akash", 2, "TCS", 10000);
		Employee e3 = new Employee("Rohan", 3, "Infosys", 10000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		for(Employee employee : list) {
			System.out.println(employee);
		}
		
		
	}
	
}
