package com.sunbeam.p2;

class Box<T> {
//	private T obj = new T(); // NOT OK
//	private static T obj; // NOT OK
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
		// Box<int> b1 = new Box<int>(); // NOT OK
		Box<Integer> b1 = new Box<Integer>();
	}

}
