package com.sunbeam.p3;

import java.util.Arrays;
import java.util.Comparator;

public class Program01 {

	public static void main(String[] args) {
		Integer[] arr = { 40, 20, 10, 30, 50 };
		System.out.println("Before Sorting - " + Arrays.toString(arr));
		Arrays.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		System.out.println("After Sorting (desc) - " + Arrays.toString(arr));

	}

}
