package com.sunbeam.p1;

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
		b1.setObj(10);
		Integer i1 = b1.getObj();
		System.out.println("i1 - " + i1);

		Box<String> b2 = new Box<String>();
		b2.setObj("sunbeam");
		String s1 = b2.getObj();
		System.out.println("s1 - " + s1);

	}

}
