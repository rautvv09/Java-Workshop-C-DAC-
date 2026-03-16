package com.sunbeam.p3;

class Box<T> {
	private T obj;

	public void setObj(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}
}

class BoxObject {
	Object ref;
}

class BoxInteger {
	Integer ref;
}

class BoxDouble {
	Double ref;
}

class BoxString {
	String ref;
}

public class Program01 {

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>(); // OK

		Box<Integer> b2 = new Box<>(); // OK

		Box<Integer> b3 = new Box();

		Box b4 = new Box();
		Box<Object> b5 = new Box<>();

//		Box<Object> b6 = new Box<String>(); // NOT OK
		Box<?> b6 = new Box<String>(); // OK
	}

}
	