package com.sunbeam.p1;

class Outer {
	int field3;
	static int field4;

	// non static Inner class
	class Inner {
		int field1;
		// static int field2; // NOT OK
		
		void innerMethod1() {
			System.out.println(field1);
			System.out.println(field3);
			System.out.println(field4);
		}

		// static void innerMethod2() {} // NOT OK
	}
}

public class Program01 {

	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();

	}

}
