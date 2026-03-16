package com.sunbeam.entity;

import java.util.Scanner;

public class Time {
	int hr;
	int min;

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter hrs - ");
		hr = sc.nextInt();
		System.out.print("Enter mins - ");
		min = sc.nextInt();
		
		sc.close();

	}

	public void display() {
		System.out.println("Time = " + hr + " : " + min);
	}
}
