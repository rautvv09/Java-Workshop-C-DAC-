package com.sunbeam.p1;

import java.util.PriorityQueue;
import java.util.Queue;

public class Program02 {

	public static void main(String[] args) {
		Queue<Integer> q1 = new PriorityQueue<>();
		q1.add(30);
		q1.add(10);
		q1.add(40);
		q1.add(20);

		System.out.println("Element at peek - " + q1.peek());

		q1.poll();

		System.out.println("After remove element at peek - " + q1.peek());

	}

}
