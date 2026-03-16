package com.sunbeam.p4;

import java.util.Arrays;
import java.util.Comparator;

public class Program01 {

	public static void main(String[] args) {

		class IntegerComparator implements Comparator<Integer> {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		}

		IntegerComparator comparator = new IntegerComparator();

		Integer[] arr = { 40, 20, 50, 30, 10 };
		System.out.println("Before sorting - " + Arrays.toString(arr));
		Arrays.sort(arr, comparator);
		System.out.println("After sorting(desc) - " + Arrays.toString(arr));

	}

}
