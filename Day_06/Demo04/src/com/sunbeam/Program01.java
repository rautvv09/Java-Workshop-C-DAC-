package com.sunbeam;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee e; // only reference of abstract class can be created
		// e = new Employee();// NOT OK- we cannot instantiate the abstract class
//		e = new Manager();
		e = new Salesman();

		e.accept(sc);
		e.display();
		e.calculateTotalSalary();
	}

}
