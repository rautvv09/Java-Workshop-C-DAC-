package com.dkte;

public class Program02 {

	public static void test() {
		double num1=77.8;
		test();
	}
	
	public static void main(String[] args) {
		try {
			test();
		}	
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
