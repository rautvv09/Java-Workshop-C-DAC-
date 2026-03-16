package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.List;
	
public class Program02 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("Anil");
		l1.add("Mukesh");
		l1.add("Ramesh");
		l1.add("Suresh");
		l1.add("Mukesh");
		l1.add("Ram");

		System.out.println("element at index 3 = " + l1.get(3));
		System.out.println("index of Ramesh = " + l1.indexOf("Ramesh"));
		System.out.println("index of Mukesh - " + l1.indexOf("Mukesh"));
		System.out.println("last index of Mukesh - " + l1.lastIndexOf("Mukesh"));
	}

}
