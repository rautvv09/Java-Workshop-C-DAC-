package com.sunbeam;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Program01 {

	public static void main(String[] args) {
//		Map<Integer, String> m1 = new HashMap<>();
//		Map<Integer, String> m1 = new LinkedHashMap<>();
		Map<Integer, String> m1 = new TreeMap<>();
		m1.put(143, "Ramesh");
		m1.put(121, "Anil");
		m1.put(132, "Mukesh");

		Set<Integer> keys = m1.keySet();
		System.out.println("Keys ->");
		for (Integer k : keys)
			System.out.println(k);

		System.out.println("Values ->");
		Collection<String> values = m1.values();
		for (String v : values)
			System.out.println(v);
	}

}
