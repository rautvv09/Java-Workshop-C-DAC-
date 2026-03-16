package com.sunbeam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program03 {

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
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by 0");
		} catch (InputMismatchException e) {
			System.out.println("Numbers are required...");
		}
		System.out.println("Program Finished...");
	}

}
