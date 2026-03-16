package com.dkte;

public class Program02 {

	public static void main(String[] args) {
		int n=88;
		int d=0;
		
		try {
			int result=n/d;		
			System.out.println("Result ->"+result);
		}catch(ArithmeticException e) {
			System.out.println("Cannot Divide by O....!");
		}
		System.out.println("Program Was Exited....");
	}

}
