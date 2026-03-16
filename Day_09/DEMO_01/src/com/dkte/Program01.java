package com.dkte;

public class Program01 {

	public static void main(String[] args) {
		String s1= new String("Akash");
		String s2="Akash";//String Literals 

		String s3="Patil";//String Literals 
		
		String s4=s2.toUpperCase();

		System.out.println("S1 :"+s1);
		System.out.println("S2 :"+s2);
		System.out.println("S3 :"+s3);
		System.out.println("S4 :"+s4);
		System.out.println("(S1==S2) :"+(s1==s2));   //it compares the references or memory locations
		System.out.println("s1.equals(S2) :"+s1.equals(s2));  //it compares the values of that variables
	}

}
