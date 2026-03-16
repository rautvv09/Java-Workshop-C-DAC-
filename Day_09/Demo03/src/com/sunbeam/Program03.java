package com.sunbeam;

import java.util.StringTokenizer;

public class Program03 {

	public static void main(String[] args) {
		String s = "www.sunbeaminfo.com/placements";
		System.out.println("OG string - " + s);
		System.out.println("Tokens ->");

		StringTokenizer st = new StringTokenizer(s, "./");
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());

	}

}
