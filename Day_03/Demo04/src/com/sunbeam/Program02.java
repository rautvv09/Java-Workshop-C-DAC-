package com.sunbeam;

public class Program02 {

	public static void square(int num1)// type of paramater - int
	{
		System.out.println("Square of num = " + (num1 * num1));
	}

	public static void square(double num1)// type of paramater - double
	{
		System.out.println("Square of num = " + (num1 * num1));
	}

	public static void main(String[] args) {
		square(5);
		square(5.5);
	}

}
