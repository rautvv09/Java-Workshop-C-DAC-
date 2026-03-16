package com.sunbeam;

public class Program01 {

	public static void main(String[] args) {
		int[] arr; // array reference
		arr = new int[5]; // array

		System.out.println("Using for-loop->");
		for (int i = 0; i < arr.length; i++)
			System.out.println("element = " + arr[i]);

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

//		for (int i = 0; i < arr.length; i++)
//			System.out.println("element = " + arr[i]);

		System.out.println("Using for-each->");
		for (int element : arr)
			System.out.println("Element = " + element);
	}

}
