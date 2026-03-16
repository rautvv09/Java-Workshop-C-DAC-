package com.sunbeam.p4;

import java.util.Date;

class Box<T> {
	private T obj;

	public Box(T obj) {
		this.obj = obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}
}

public class Program01 {

	// unbounded type paramater -> Upper Bound
	public static void displayBox(Box<? extends Number> b) {
		System.out.println("value - " + b.getObj());
	}

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>(10);
		displayBox(b1);
		Box<Double> b2 = new Box<Double>(10.20);
		displayBox(b2);
		Box<String> b3 = new Box<String>("sunbeam");
		// displayBox(b3); // NOT OK
		Box<Date> b4 = new Box<Date>(new Date());
		// displayBox(b4); // NOT OK
	}

}
