package com.dkte;

import java.util.Scanner;

enum ArithmeticOperation {
	EXIT, ADDITION, SUBSTRACTION, MULTIPLICATION, DIVISION, SQUARE, SQUAREROOT
}

public class Program01 {

	private static ArithmeticOperation menu(Scanner sc) {
		ArithmeticOperation arr[] = ArithmeticOperation.values();
		for (ArithmeticOperation e : arr)
			System.out.println(e.ordinal() + ". " + e.name());

		System.out.print("Enter your choice - ");
		int choice = sc.nextInt();

		if (choice < 0 || choice >= arr.length) {
			System.out.println("Invalid choice. Please try again.");
			return menu(sc); // Recursively call menu until valid input
		}

		return arr[choice];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArithmeticOperation choice;

		do {
			choice = menu(sc);

			switch (choice) {
			case EXIT:
				System.out.println("Exiting program...");
				break;

			case ADDITION:
				System.out.print("Enter two numbers: ");
				double a1 = sc.nextDouble();
				double a2 = sc.nextDouble();
				System.out.println("Result = " + (a1 + a2));
				break;

			case SUBSTRACTION:
				System.out.print("Enter two numbers: ");
				double s1 = sc.nextDouble();
				double s2 = sc.nextDouble();
				System.out.println("Result = " + (s1 - s2));
				break;

			case MULTIPLICATION:
				System.out.print("Enter two numbers: ");
				double m1 = sc.nextDouble();
				double m2 = sc.nextDouble();
				System.out.println("Result = " + (m1 * m2));
				break;

			case DIVISION:
				System.out.print("Enter two numbers: ");
				double d1 = sc.nextDouble();
				double d2 = sc.nextDouble();
				if (d2 == 0)
					System.out.println("Error: Division by zero is not allowed.");
				else
					System.out.println("Result = " + (d1 / d2));
				break;

			case SQUARE:
				System.out.print("Enter a number: ");
				double sq = sc.nextDouble();
				System.out.println("Result = " + (sq * sq));
				break;

			case SQUAREROOT:
				System.out.print("Enter a number: ");
				double sqrt = sc.nextDouble();
				if (sqrt < 0)
					System.out.println("Error: Cannot find square root of a negative number.");
				else
					System.out.println("Result = " + Math.sqrt(sqrt));
				break;

			default:
				System.out.println("Invalid option.");
			}
			System.out.println("-----------------------------------------");

		} while (choice != ArithmeticOperation.EXIT);

		sc.close();
	}
}
