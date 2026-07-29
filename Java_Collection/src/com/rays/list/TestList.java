package com.rays.list;

import java.util.List;
import java.util.ArrayList;

public class TestList {

	public static void main(String[] args) {
		List list = new ArrayList();

		list.add(0, "Ram");
		list.add(1, 'a');
		list.add(2, 2.3);
		// list.add(6, "Sita"); index out of bound
		list.add(3, true);
		list.add(4, 45);
		list.add(5, "Ram");
		list.add(6, "Shyamu");
		list.add(6, "Sita");

		System.out.println("List : " + list);

		System.out.println("Get index : " + list.get(5)); // Ram

		System.out.println("----------------------------------------------------------");
		System.out.println("Remove index : " + list.remove(4));
		System.out.println("After remove : " + list);

		System.out.println("----------------------------------------------------------");
		System.out.println("Set " + list.set(0, "Riya"));
		System.out.println(list);

		System.out.println("----------------------------------------------------------");
		System.out.println("Index Of :");
		System.out.println(list.indexOf("Ram"));

		System.out.println("----------------------------------------------------------");
		System.out.println("Last Index Of : ");
		System.out.println(list.lastIndexOf("Ram"));

		System.out.println("----------------------------------------------------------");
		System.out.println("Sublist : ");
		System.out.println(list.subList(4, 6));

//		list.add("Ram");
//		list.add('a');
//		list.add(2.3);
//		list.add(true);
//		list.add(45);
//		list.add("Ram");
//		list.add("Ram");

	}

}

//1. List can contain duplicate elements
//2. List can contain multiple null values
//3. Order of list is natural order

//add
//get()
//remove
//set
//indexOf
//lastIndexOf
