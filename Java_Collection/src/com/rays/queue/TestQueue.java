package com.rays.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestQueue {

	public static void main(String[] args) {

		Queue q = new ArrayDeque();
		q.add(1);
		q.add("Meet");
		q.add('t');
		q.add(true);// parent method
		q.offer(5);// queue method

		System.out.println("Queue : " + q);

		System.out.println("--------------");
		System.out.println("Remove Meet : " + q.remove("Meet"));// (parent method)
		System.out.println(q);

		System.out.println("--------------");
		System.out.println("poll()  :" + q.poll());// this remover the head of the queue and return it (child method)
		System.out.println(q);

		System.out.println("--------------");
		System.out.println("element() : " + q.element());// this return the head but not remove it from queue (parent method)
		System.out.println(q);

		System.out.println("--------------");
		System.out.println("peek()  : " + q.peek()); // (child method)
		System.out.println(q);

	}

}
