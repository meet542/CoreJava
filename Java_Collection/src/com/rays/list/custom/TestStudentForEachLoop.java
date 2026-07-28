package com.rays.list.custom;

import java.util.List;
import java.util.ArrayList;

public class TestStudentForEachLoop {
	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		
		Student s1 = new Student("Ram", 1, "Maths");
		Student s2 = new Student("Shubh", 2, "Biology");
		Student s3 = new Student("Lakhan", 3, "Physics");
		Student s4 = new Student("Meet", 4, "Chemistry");
		Student s5 = new Student("Ayana", 3, "Accounts");
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		for(Student student : list) {
			System.out.println(student);
		}
		
	}
}
