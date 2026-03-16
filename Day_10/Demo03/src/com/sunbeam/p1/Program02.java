package com.sunbeam.p1;

import java.util.Arrays;

public class Program02 {

	public static void main(String[] args) {
		String[] arr = { "Mukesh", "Suresh", "Ramesh", "Anil", "Sham", "Ram" };
		System.out.println("Before Sorting - " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After Sorting - " + Arrays.toString(arr));
	}

	public static void main1(String[] args) {
		int[] arr1 = { 50, 10, 40, 20, 30 };
		System.out.println("Before sorting - " + Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println("After sorting - " + Arrays.toString(arr1));
	}

}
