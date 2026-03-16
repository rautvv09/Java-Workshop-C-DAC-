package p1;

public class A {
	private int num1;
	int num2; // default (Package level private)
	protected int num3;
	public int num4;

	void displayA() {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
	}
}
