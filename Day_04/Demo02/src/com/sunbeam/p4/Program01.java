package com.sunbeam.p4;

class Test {
//	final int num1 = 10;
	final int num1;

	{
		// num1 = 100;
	}

	public Test() {
		num1 = 1000;
	}
}

public class Program01 {

	public static void main(String[] args) {
		Test t1 = new Test();
	}

}
