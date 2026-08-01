package com.rays.collection.sort.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudent {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();

		Student s1 = new Student("Ram", 3, "Maths");
		Student s2 = new Student("Shubh", 2, "Biology");
		Student s3 = new Student("Lakhan", 1, "Physics");
		Student s4 = new Student("Meet", 4, "Chemistry");
		Student s5 = new Student("Ayana", 5, "Accounts");
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		list.forEach(System.out::println);
		
		Collections.sort(list);
		
		System.out.println("-----------------------------------------------");
		
		list.forEach(System.out::println);
	}
}
