package com.rays.queue;

import java.util.PriorityQueue;

public class TestPriorityQueue {

	public static void main(String[] args) {

		PriorityQueue pq = new PriorityQueue();

		pq.add(1);
		//pq.add("Tanisha"); this is not possible
		pq.add(4);

		System.out.println(pq);
	}
}
