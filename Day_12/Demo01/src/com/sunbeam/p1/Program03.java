package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program03 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("Suresh");
		l1.add("Mukesh");
		l1.add("Anil");
		l1.add("Ramesh");
		l1.add("Ram");

		System.out.println("Before sorting");
		for (String s : l1)
			System.out.println(s);

		Collections.sort(l1);

		System.out.println("After sorting");
		for (String s : l1)
			System.out.println(s);
	}

}
