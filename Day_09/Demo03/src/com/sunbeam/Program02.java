package com.sunbeam;

import java.util.StringTokenizer;

public class Program02 {

	public static void main(String[] args) {
		String s = "sunbeam infotech pune";
		System.out.println("OG string - " + s);
		System.out.println("Tokens ->");

		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());

	}

}
