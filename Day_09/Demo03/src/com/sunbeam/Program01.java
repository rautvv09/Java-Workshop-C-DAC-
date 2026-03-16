package com.sunbeam;

import java.util.StringTokenizer;

public class Program01 {

		public static void main(String[] args) {
		String s = "www.sunbeaminfo.com";
		System.out.println("OG string - " + s);
		System.out.println("Tokens ->");

		StringTokenizer st = new StringTokenizer(s, ".");
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());

	}

}
