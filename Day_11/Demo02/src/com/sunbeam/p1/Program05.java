package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program05 {

	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<>();

		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(40);

		System.out.println("Total Elements in c1 - " + c1.size());

		// using Iterator
		Iterator<Integer> itr = c1.iterator();
		while (itr.hasNext()) {
			System.out.println("element - " + itr.next());
		}
	}

}
