package com.sunbeam;

import java.util.Scanner;

public class Program04 {

	public static int menu(Scanner sc) {
		System.out.println("--------------------");
		System.out.println("0. EXIT");
		System.out.println("1. Add Student");
		System.out.println("2. Display Student");
		System.out.println("3. Find Student");
		System.out.print("Enter your choice - ");
		int choice = sc.nextInt();
		System.out.println("--------------------");
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
				System.out.println("Add Student");
				break;
			case 2:
				System.out.println("Display All Student");
				break;
			case 3:
				System.out.println("Search");
				break;
			default:
				System.out.println("Wrong choice.. :(");
				break;
			}
		}

	}

}
