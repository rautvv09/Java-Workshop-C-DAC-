package com.sunbeam;

public class Program01 {

	public static void main(String[] args) {
		String s1 = "sunbeam"; // String Literals
//		String s2 = new String("sunbeam");
		String s2 = "sunbeam";
		s2 = "infotech";

		String s3 = s2.toUpperCase(); // strings are immutable

		System.out.println("s1 - " + s1);
		System.out.println("s2 - " + s2);
		System.out.println("s3 - " + s3);
		System.out.println("(s1==s2) - " + (s1 == s2));

	}

}
