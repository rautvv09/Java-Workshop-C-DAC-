package com.sunbeam.entity;

import java.util.Scanner;

public class Time {

	int hr;
	int min;
	
	public void accept() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter hrs-");
		hr=sc.nextInt();
		
		System.out.println("Enter Minu-");
		min=sc.nextInt();
		
		
	}

	public void Display() {
		System.out.println("Time="+ hr +" : "+ min);
	}
}
