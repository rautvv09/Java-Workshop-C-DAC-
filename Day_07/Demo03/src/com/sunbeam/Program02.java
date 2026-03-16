package com.sunbeam;

public class Program02 {

	public static void main(String[] args) {
		int n = 10;
		int d = 0;
		try {
			int result = n / d;
			System.out.println("Result - " + result);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by 0");
		}
		System.out.println("Program Finished...");
	}

}
