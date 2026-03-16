package com.sunbeam;

import java.util.Scanner;

public class Program05 {

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
		Student[] arr = new Student[5];
		int index = 0;
		int choice;
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
				if (index < 5) {
					arr[index] = new Student();
					arr[index].acceptStudent();
					index++;
				} else
					System.out.println("Course is full");
				break;
			case 2:
				for (Student s : arr)
					if (s != null)
						s.displayStudent();
				break;
			case 3:
				System.out.print("Enter student ID to find: ");
				int idToFind = sc.nextInt();
				boolean found = false;
				for (Student s : arr) {
					if (s != null && s.getId() == idToFind) {
						s.displayStudent();
						found = true;
						break; 
					}
				}
				if (!found)
					System.out.println("Student not found.");
				break;
			default:
				System.out.println("Wrong choice.. :(");
				break;
			}
		}

	}

}
