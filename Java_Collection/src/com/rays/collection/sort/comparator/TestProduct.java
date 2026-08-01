package com.rays.collection.sort.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestProduct {

	public static void main(String[] args) {

		Product p1 = new Product("PS5", 59000, "Electronic");
		Product p2 = new Product("iPhone 16", 85000, "Mobile");
		Product p3 = new Product("Nike Shoes", 4500, "Footwear");
		Product p4 = new Product("Laptop", 72000, "Electronic");
		Product p5 = new Product("Office Chair", 6500, "Furniture");
		Product p6 = new Product("Smart Watch", 12000, "Wearable");
		Product p7 = new Product("Refrigerator", 38000, "Appliance");

		List<Product> list = new ArrayList<Product>();

		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		list.add(p7);

		System.out.println("Original List : ");
		list.forEach(System.out::println);

		System.out.println("--------------------------------------------------------------------------");

		
		OrderByProductNameAsc byNameAsc = new OrderByProductNameAsc();

		System.out.println("List ordered by name in ascending order : ");
		
		Collections.sort(list, byNameAsc);
		
		list.forEach(System.out::println);
		
		System.out.println();
		
		OrderByProductNameDesc byNameDesc = new OrderByProductNameDesc();

		System.out.println("List ordered by name in descending order : ");
		
		Collections.sort(list, byNameDesc);
		
		list.forEach(System.out::println);
		

		System.out.println("--------------------------------------------------------------------------");
		
		OrderByProductPriceAsc byPriceAsc = new OrderByProductPriceAsc();

		Collections.sort(list, byPriceAsc);
		
		System.out.println("List ordered by price in ascending order : ");
		
		list.forEach(System.out::println);
		
		System.out.println();
		
		OrderbyProductPriceDesc byPriceDesc = new OrderbyProductPriceDesc();

		Collections.sort(list, byPriceDesc);
		
		System.out.println("List ordered by price in descending order : ");

		list.forEach(System.out::println);
		

		System.out.println("--------------------------------------------------------------------------");
		
		OrderByProductCategoryDesc byCategoryAsc = new OrderByProductCategoryDesc();

		Collections.sort(list, byCategoryAsc);
		
		System.out.println("List ordered by category in ascending order : ");
		
		list.forEach(System.out::println);
		
		System.out.println();
		
		OrderByProductCategoryDesc byCategoryDesc = new OrderByProductCategoryDesc();

		Collections.sort(list, byCategoryDesc);
		
		System.out.println("List ordered by category in descending order : ");

		list.forEach(System.out::println);	

	}

}
