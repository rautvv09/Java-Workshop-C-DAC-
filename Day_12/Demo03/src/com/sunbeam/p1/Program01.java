package com.sunbeam.p1;

import java.util.ArrayDeque;
import java.util.Queue;

public class Program01 {

	public static void main(String[] args) {
		Queue<Integer> q1 = new ArrayDeque<>();
		q1.add(10);
		q1.offer(20);
		q1.add(30);
		q1.offer(40);

		System.out.println("Element at front - " + q1.peek());
		System.out.println("Element at front - " + q1.element());

		q1.poll();
		q1.remove();
		q1.remove();
		q1.poll();

//		q1.poll();
		q1.remove();

		System.out.println("After remove,Element at front - " + q1.peek());
		// System.out.println("After remove,Element at front - " + q1.element());

	}

}
