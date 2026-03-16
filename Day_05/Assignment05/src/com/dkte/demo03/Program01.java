package com.dkte.demo03;
import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Manager m = new Manager(1, 10000, 5000);
		m.display();

		Manager m2 = new Manager();
		m2.accept(sc);
		m2.display();
	}

}
