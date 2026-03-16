package com.dkte.p1;

class Box{
	
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	
	
}

public class Program01 {

	public static void main(String args[]) {
		
//		Box b1=new Box();
//		b1.setObj(new Integer(10));
//		Integer i1=(Integer)b1.getObj();//DownCasting
//		System.out.println("i1 :"+i1);
		
		Box b2=new Box();
		b2.setObj(new String("Akshay.........."));
		String s2=(String)b2.getObj();
		System.out.println("s2 :"+s2);
		
		Box b3 = new Box();
		b3.setObj("10.20");
		Double d1 = (Double) b3.getObj();
		System.out.println("d1 =  " + d1);
	} 
	
}
