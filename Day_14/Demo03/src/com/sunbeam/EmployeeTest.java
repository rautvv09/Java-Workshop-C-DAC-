package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeTest {

	public static int menu(Scanner sc) {
		System.out.println("0. EXIT");
		System.out.println("1. Display All Employees");
		System.out.println("2. Display All Employees sorted on empid");
		System.out.println("3. Display All Employees sorted on name");
		System.out.println("4. Display All Employees sorted on salary");
		System.out.println("5. Display All Employees sorted on salary(desc)");
		System.out.println("Enter your choice - ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(4, "Suresh", 20000));
		empList.add(new Employee(1, "Ram", 50000));
		empList.add(new Employee(5, "Mukesh", 40000));
		empList.add(new Employee(2, "Anil", 10000));
		empList.add(new Employee(3, "Ramesh", 30000));
		int choice;
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
				empList.forEach(e -> System.out.println(e));
				break;
			case 2:
				Collections.sort(empList);
				empList.forEach(e -> System.out.println(e));
				break;
			case 3:
				empList.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
				empList.forEach(e -> System.out.println(e));
				break;
			case 4:
				empList.sort((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
				empList.forEach(e -> System.out.println(e));
				break;
			case 5:
				empList.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
				empList.forEach(e -> System.out.println(e));
				break;

			default:
				break;
			}
		}
	}

}
