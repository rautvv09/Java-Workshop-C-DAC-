package com.sunbeam;

import java.util.Scanner;

public class Program06 {

	public static void main(String[] args) {
		int n;
		int d;
		try (Scanner sc = new Scanner(System.in);) {
			System.out.print("Enter the numnerator - ");
			n = sc.nextInt();
			System.out.print("Enter the denominator - ");
			d = sc.nextInt();
			int result = n / d;
			System.out.println("Result - " + result);

		}
		System.out.println("Program Finished...");
	}

}
