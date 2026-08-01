package com.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

class TestContestWinner {

	public static void main(String[] args) {
		ArrayList<ContestWinner> list = new ArrayList<ContestWinner>();

		list.add(new ContestWinner("Ram", "7875896985"));
		list.add(new ContestWinner("Shyam", "6985878589"));
		list.add(new ContestWinner("Ajay", "6985878589"));
		list.add(new ContestWinner("Vijay", "7875896985"));
		list.add(new ContestWinner("Jay", "7875836985"));
		list.add(new ContestWinner("Pappu", "6585898587"));
		list.add(new ContestWinner("invalidNo", "78858"));

		System.out.println("--------------");

		System.out.println("original List:");
		list.forEach(System.out::println);

		System.out.println("--------------");

		// get phone number
		list.stream().map(e -> e.phoneNo).forEach(System.out::println);

		System.out.println("--------------");

		// get valid phoneNo
		list.stream().map(e -> e.phoneNo).filter(e -> e.length() == 10).forEach(System.out::println);

		System.out.println("--------------");

		// remove duplicate phoneNo
		list.stream().map(e -> e.phoneNo).filter(e -> e.length() == 10).distinct().forEach(System.out::println);

		System.out.println("--------------");

		// shuffle phoneNo
		list.stream().map(e -> e.phoneNo).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(3).forEach(System.out::println);

	}

}
