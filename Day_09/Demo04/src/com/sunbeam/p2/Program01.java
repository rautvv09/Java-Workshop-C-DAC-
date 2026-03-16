package com.sunbeam.p2;

// java 1.5 onwards
class Box<T> {
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
		b1.setObj(new Integer(10));
//		b1.setObj(new String("sunbeam")); // NOT OK
		Integer i1 = b1.getObj();
		System.out.println("i1 - " + i1);

		Box<String> b2 = new Box<String>();
		b2.setObj(new String("sunbeam"));
		String s1 = b2.getObj();
		System.out.println("s1 = " + s1);
	}

}
