package com.sunbeam;

import java.util.Scanner;

public class Program05 {

	public static void main(String[] args) {
		int n;
		int d;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter the numnerator - ");
			n = sc.nextInt();
			System.out.print("Enter the denominator - ");
			d = sc.nextInt();
			int result = n / d;
			System.out.println("Result - " + result);

		} finally {
			System.out.println("Inside Finally");
			sc.close();
		}
		System.out.println("Program Finished...");
	}

}
