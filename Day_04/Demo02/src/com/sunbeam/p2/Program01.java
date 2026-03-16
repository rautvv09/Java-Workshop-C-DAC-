package com.sunbeam.p2;

class Test {
	int num1;
//	static int num2 = 20; // field initializer
	private static int num2;

	// static block
	static {
		System.out.println("Inside static block");
		num2 = 200;
	}

	static int getNum2() {
		// num1 = 1000; // NOT OK
		return num2;
	}

	public Test(int num1) {
		this.num1 = num1;
	}

	void display() {
		System.out.println(num1);
		System.out.println(num2);
	}
}

public class Program01 {

	public static void main(String[] args) {
//		System.out.println(Test.num2);
		System.out.println(Test.getNum2());
		// Test t1 = new Test(10);
		// Test t2 = new Test(100);
		// System.out.println(t1.num2);
	}

}
