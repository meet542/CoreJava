package com.rays.stream;

import java.util.ArrayList;
import java.util.Comparator;

public class TestStream {
	public static void main(String[] args) {
	
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Tarun");
		list.add("Raman");
		list.add("Bahubali");
		list.add("Karan");
		list.add("Kattappa");
		list.add("Kattappa");
		list.add("Kattappa");
		list.add("Uday");
		
		System.out.println("Original List:");
		System.out.println();
		list.forEach(System.out::println);
		
		System.out.println("-----------------");
		
		System.out.println("Ascending Order: ");
		System.out.println();
		list.stream().sorted().forEach(System.out::println);
		
		System.out.println("-----------------");
		
		System.out.println("Descending Order:");
		System.out.println();
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("-----------------");
		System.out.println("Ascending Order(unique elements):");
		System.out.println();
		list.stream().sorted().distinct().forEach(System.out::println);
		
		System.out.println("-----------------");
		System.out.println("Descending Order(unique elements):");
		System.out.println();
		list.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);
		System.out.println();
		
		System.out.println("-----map method------"); // String integer
		System.out.println("To lowercase:");
		System.out.println();
		list.stream().map(e -> e.toLowerCase()).forEach(System.out::println);
		System.out.println();
		
		System.out.println("To uppercase: ");
		System.out.println();
		list.stream().map(e -> e.toUpperCase()).forEach(System.out::println);
		System.out.println();
		
		System.out.println("To lowercase(unique elements):");
		System.out.println();
		list.stream().map(e -> e.toLowerCase()).distinct().forEach(System.out::println);
		System.out.println();
		
		System.out.println("To uppercase(unique elements):");
		System.out.println();
		list.stream().map(e -> e.toUpperCase()).distinct().forEach(System.out::println);
		System.out.println();
		
		System.out.println("To lowercase(unique and sorted):");
		System.out.println();
		list.stream().map(e -> e.toLowerCase()).sorted().distinct().forEach(System.out::println);
		System.out.println();
		
		System.out.println("To uppercase(unique and sorted):");
		System.out.println();
		list.stream().map(e -> e.toUpperCase()).sorted().distinct().forEach(System.out::println);
		System.out.println();
		
		
		System.out.println("-----filter method-----");// boolean
		System.out.println("Start with 'K' and unique:");
		System.out.println();
		list.stream().filter(e -> e.startsWith("K")).distinct().forEach(System.out::println);
		System.out.println();
		
		System.out.println("Ends with 'a':");
		System.out.println();
		list.stream().filter(e -> e.endsWith("a")).forEach(System.out::println);
		
	}

}
