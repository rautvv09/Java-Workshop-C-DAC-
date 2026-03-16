package com.sunbeam;

import java.util.HashSet;
import java.util.Set;

public class Program01 {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<>();
		s1.add("Anil");
		s1.add("Mukesh");
		s1.add("Mukesh"); // Duplicate elements are not allowed in set
		s1.add(null);
		s1.add(null);

		System.out.println("size of s1 - " + s1.size());

		for (String s : s1)
			System.out.println(s);
	}

}
