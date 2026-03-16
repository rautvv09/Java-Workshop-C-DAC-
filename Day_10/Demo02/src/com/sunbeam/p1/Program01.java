package com.sunbeam.p1;

public class Program01 {

	public static <T> void displayArray(T[] arr) {
		System.out.println();
		for (T element : arr)
			System.out.println("element - " + element);
	}

	public static void main(String[] args) {
		Integer arr[] = { 10, 20, 30, 40, 50 };
		displayArray(arr);

		Double[] arr2 = { 11.22, 22.33, 33.44, 44.55 };
		displayArray(arr2);

		String[] arr3 = { "Anil", "Mukesh", "Ramesh", "Suresh", "Ram", "Sham" };
		displayArray(arr3);
	}

}
