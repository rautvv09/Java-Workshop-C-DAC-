package com.dkte;


interface I1{
	
}

interface I2{
	
}

interface I3 extends I1,I2{
	
}

class C1{
	
}

class C2{
	
}


class C3 extends C1 implements I1,I2{
	
}
public class Program02 {

	public static void main(String[] args) {
	//	class C3 extends C1;//ok
//		class c3 extends C1,C2;//not ok

		//class C3 implements I1;//ok
	//	class C3 implements I1,I2;//ok
	//	class C3 extends I1;//ok
		
//		interface I3 extends C1 // NOT OK
//		interface I3 implements C1 // NOT OK
//		interface I3 implements I1 // NOT OK
//		interface I3 extends I1 // OK
//		interface I3 extends I1, I2// OK

//		class C3 extends C1 implements I1, I2// OK
//		class C3 implements I1, I2 extends C1 // NOT OK
	}

}
