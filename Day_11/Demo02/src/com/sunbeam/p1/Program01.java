package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.Collection;

public class Program01 {

	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<>();
//		Collection<Integer> c1 = new LinkedList<>();
//		Collection<Integer> c1 = new LinkedHashSet<>();

		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(40);

		System.out.println("Total Elements in c1 - " + c1.size());

		for (Integer e : c1)
			System.out.println("Element - " + e);
	}

}
