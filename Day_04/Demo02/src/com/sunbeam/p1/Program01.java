package com.sunbeam.p1;

class Test {
	int num1 = 10; // Field Initializer
	// int num1;

	// object initializer
	{
		System.out.println("Object initializer");
		num1 = 100;
	}

	Test() {
		System.out.println("Ctor");
		num1 = 1000;
	}

}

public class Program01 {

	public static void main(String[] args) {
		Test t1 = new Test();
		System.out.println(t1.num1);

	}

}
