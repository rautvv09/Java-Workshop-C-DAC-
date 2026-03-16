package com.dkte.p2;

class Box<T>{
	
	//private T obj=new T();// NOT OK
	//private static T obj;// NOT OK

	
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public Box(T obj) {
		this.obj = obj;
	}

	public Box() {
		
	}
	
	
}

public class Program01 {

	public static void main(String[] args) {
		
		//Box<int> b1=new Box<int>();// NOT OK
		
		Box<Integer> b2=new Box<Integer>();
		b2.setObj(12);
		Integer i1=(Integer)b2.getObj();
		System.out.println(" i1:"+i1);
	}
	
}
