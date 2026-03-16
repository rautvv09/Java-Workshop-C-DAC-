package com.sunbeam;

import java.util.Scanner;

enum ArithmeticOperation {
	EXIT, ADDITION, SUBSTRACTION, MULTIPLICATION, DIVISION, SQUARE, SQUAREROOT
}

public class Program01	
{

	private static ArithmeticOperation menu(Scanner sc) {
		ArithmeticOperation arr[] = ArithmeticOperation.values();
		for (ArithmeticOperation e : arr)
			System.out.println(e.ordinal() + ". " + e.name());

		System.out.print("Enter your choice - ");
		return arr[sc.nextInt()];

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArithmeticOperation choice = menu(sc);
		switch (choice) {
		case EXIT:
			break;
		case ADDITION:
			break;
		case SUBSTRACTION:	
			break;
		case MULTIPLICATION:
			break;
		case DIVISION:
			break;
		case SQUARE:
			break;
		case SQUAREROOT:
			break;

		}
	}

}
