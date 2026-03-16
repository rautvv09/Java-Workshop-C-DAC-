package com.sunbeam;

import java.util.Set;
import java.util.TreeSet;

public class Program02 {

	public static void main(String[] args) {
//		Set<String> s1 = new HashSet<>(); // order of the elements is not maintained
//		Set<String> s1 = new LinkedHashSet<>(); // maintains the order of insertion
		Set<String> s1 = new TreeSet<>(); // maintains the natural ordering of the elements
		s1.add("Suresh");
		s1.add("Mukesh");
		s1.add("Anil");
		s1.add("Ramesh");
		s1.add("Ram");

		System.out.println("size of s1 - " + s1.size());

		for (String s : s1)
			System.out.println(s);
	}

}
