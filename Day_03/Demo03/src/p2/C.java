package p2;

import p1.A;

public class C {
	void displayC() {
		A a = new A();
//		System.out.println(a.num1); // NOT OK
		// System.out.println(a.num2); // NOT OK
		// System.out.println(a.num3); // NOT OK
		System.out.println(a.num4); // OK
	}
}
