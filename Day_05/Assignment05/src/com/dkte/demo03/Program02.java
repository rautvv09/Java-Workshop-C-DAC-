package com.dkte.demo03;

import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Salesman sm = new Salesman();
		sm.accept(sc);
		sm.display();
	}

}
