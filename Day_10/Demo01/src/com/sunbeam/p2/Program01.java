package com.sunbeam.p2;

// Bounded Type Parameter
class Box<T extends Number> {
	private T obj;

	public void setObj(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}
}

public class Program01 {

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>();
		b1.setObj(10);
		Integer i1 = b1.getObj();
		System.out.println("i1 - " + i1);

//		Box<String> b2 = new Box<String>(); // NOT OK
//		Box<Date> b2 = new Box<Date>(); // NOT OK

		Box<Number> b2 = new Box<Number>(); // OK
		Box<Double> b3 = new Box<Double>(); // OK

	}

}
