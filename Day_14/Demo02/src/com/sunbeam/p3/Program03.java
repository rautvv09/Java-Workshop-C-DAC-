package com.sunbeam.p3;

import java.util.Arrays;

public class Program03 {

	public static void main(String[] args) {
		Integer[] arr = { 40, 20, 10, 30, 50 };
		System.out.println("Before Sorting - " + Arrays.toString(arr));
		// short-hand implementation of functional interface
		// lambda expression
		// `->` : lambda operator
		Arrays.sort(arr, (o1, o2) -> o2 - o1);
		System.out.println("After Sorting (desc) - " + Arrays.toString(arr));

	}

}
