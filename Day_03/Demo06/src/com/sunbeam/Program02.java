package com.sunbeam;

public class Program02 {

	public static void main(String[] args) {
		int[][] arr; // array reference
		arr = new int[2][3]; // array

		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;

		// using for-loop
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Element -" + arr[i][j]);
			}
		}

		// using for-each
		for (int[] element : arr)
			for (int e : element)
				System.out.println("element - " + e);
	}

}
