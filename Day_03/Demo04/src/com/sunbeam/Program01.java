package com.sunbeam;

public class Program01 {

	public static void add(int num1, int num2)// no of paramaters = 2
	{
		System.out.println("Addition of 2 nos = " + (num1 + num2));
	}

	public static void add(int num1, int num2, int num3) // no of paramaters = 3
	{
		System.out.println("Addition of 3 nos = " + (num1 + num2 + num3));
	}

	public static void add(int num1, int num2, int num3, int num4) // no of paramaters = 4
	{
		System.out.println("Addition of 4 nos = " + (num1 + num2 + num3 + num4));
	}

	public static void main(String[] args) {
		add(10, 20);
		add(10, 20, 30);
		add(10, 20, 30, 40);
	}

}
