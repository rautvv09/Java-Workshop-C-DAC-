package com.sunbeam;

public class Program03 {

	public static void main(String[] args) {
		String s1 = "sunbeam";
		String s2 = new String("sunbeam");

		StringBuilder sb1 = new StringBuilder("sunbeam");
		StringBuilder sb2 = new StringBuilder("sunbeam");

		System.out.println("s1 == s2 - " + (s1 == s2));
		System.out.println("s1.equals(s2) - " + (s1.equals(s2)));

		System.out.println("sb1 == sb2 - " + (sb1 == sb2));
		System.out.println("sb1.equals(sb2) - " + (sb1.equals(sb2)));
	}

}
