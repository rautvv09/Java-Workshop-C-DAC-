package com.sunbeam.p1;

import java.util.Vector;

public class Program02 {

	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<>();

		for (int i = 1; i <= 10; i++)
			v1.add(i);

		// v1.add(11);

		for (int i = 1; i <= 10; i++)
			v1.add(i + 10);

		v1.add(21);

		System.out.println("size of v1 - " + v1.size());
		System.out.println("capacity of v1 - " + v1.capacity());
	}

}
