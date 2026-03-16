package com.dkte.p1;


class Box<T>{
	
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	
}
public class Program01 {

	public static void main(String[] args) {
		
	Box<Integer> b1=new Box<Integer>();
	b1.setObj(33);
	Integer i1=b1.getObj();
	System.out.println(" i1 :"+i1);
	
	Box<String> b2=new Box<String>();
	b2.setObj("Anil");
	String s2=b2.getObj();
	System.out.println(" s2 :"+s2);
	
	}
}
