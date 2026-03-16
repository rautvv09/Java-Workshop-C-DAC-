package com.sunbeam.p3;

class Circle {
	int radius;
	static double PI = 3.14;

	public Circle(int radius) {
		this.radius = radius;
	}

	public void calculateArea() {
		System.out.println("Area of circle = " + (PI * radius * radius));
	}
}

public class Program01 {

	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(7);
		Circle c3 = new Circle(9);

	}

}
