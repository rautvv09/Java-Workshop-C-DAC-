package com.sunbeam;

import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e = null;
		System.out.println("Press 1 for Employee");
		System.out.println("Press 2 for Manager");
		System.out.println("Press 3 for Salesman");
		System.out.print("Enter your choice - ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			e = new Employee();
			break;
		case 2:
			e = new Manager();
			break;
		case 3:
			e = new Salesman();
			break;
		}
		e.accept(sc);
		e.display();
		// e.calculateTotalCommission(); //NOT OK - object slicing

		if (e instanceof Salesman) {
			Salesman s = (Salesman) e; // Downcasting
			// process of converting the super class reference into subclass
			// referfence is called as downcasting
			s.calculateTotalCommission();
		}
	}

}
