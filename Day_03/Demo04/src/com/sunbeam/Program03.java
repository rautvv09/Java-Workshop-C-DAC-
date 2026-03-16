package com.sunbeam;

public class Program03 {

	public static void division(int n, double d)// order of paramater - int , double
	{
		System.out.println("Division = " + (n / d));
	}

	public static void division(double n, int d)// order of paramater - double, int
	{
		System.out.println("Division = " + (n / d));
	}

	public static void main(String[] args) {
		division(10, 2.5);
		division(10.5, 2);
	}

}
