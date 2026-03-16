package com.sunbeam;

public class Program01 {

	public static void main(String[] args) {
		// Ragged Array
		int[][] arr = new int[2][];
		arr[0] = new int[2];
		arr[1] = new int[3];

		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;
		arr[1][2] = 50;

		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++)
				System.out.println("Element - " + arr[i][j]);

		System.out.println("Using for-each ->");

		for (int[] element : arr)
			for (int ele : element)
				System.out.println("element - " + ele);
	}

}
