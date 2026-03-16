package p1;

public class B {
	void displayB() {
		A a = new A();
		// System.out.println(a.num1); // NOT OK
		System.out.println(a.num2); // OK
		System.out.println(a.num3); // OK
		System.out.println(a.num4); // OK
	}
}
