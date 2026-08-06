package com.rays.stream;

import java.util.ArrayList;

public class TestStreamOddEven {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			list.add(i + 1);
		}

		System.out.println("Original list:");
		System.out.println(list);
		System.out.println();

		System.out.println("Even numbers from list:");
		list.stream().filter(e -> (e % 2 == 0)).forEach(System.out::println);
		System.out.println();

		System.out.println("Odd numbers from list:");
		list.stream().filter(e -> (e % 2 != 0)).forEach(System.out::println);

	}
}
