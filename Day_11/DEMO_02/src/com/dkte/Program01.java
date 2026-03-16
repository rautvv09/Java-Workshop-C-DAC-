package com.dkte;

import java.util.ArrayList;
import java.util.Collection;
//import java.util.LinkedHashSet;
//import java.util.LinkedList;

public class Program01 {

	public static void main(String[] args) {

		Collection<Integer> c1=new ArrayList<>();
		
//		Collection<Integer> c2=new LinkedList<>();
//		
//		Collection<Integer> c3=new LinkedHashSet<>();
		
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(40);
		
	
		System.out.println("Printing Elements :\n");
		for(int ele:c1) {
			System.out.println("Elements ->"+ele);
		}
		
		c1.clear();
		System.out.println("Printing After Clear Command Elements :\n");
		for(int ele:c1) {
			System.out.println("Elements ->"+ele);
		}
		
		
	}

}
