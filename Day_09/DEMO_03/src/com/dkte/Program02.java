package com.dkte;

import java.util.StringTokenizer;

public class Program02 {

	public static void main(String[] args) {

		String s="sunbeam infotech pune";
		
		System.out.println("OG String ->"+s);
		
		System.out.println("\n Tokens ->");
		
		StringTokenizer st=new StringTokenizer(s);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
