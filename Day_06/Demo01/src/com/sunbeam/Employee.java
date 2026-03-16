package com.sunbeam;

import java.util.Scanner;

public class Employee {
	int empid;
	double salary;

	public Employee() {
	}

	public Employee(int empid, double salary) {
		this.empid = empid;
		this.salary = salary;
	}

	public void accept(Scanner sc) {
		System.out.println("Enter empid - ");
		empid = sc.nextInt();
		System.out.println("Enter salary - ");
		salary = sc.nextDouble();
	}

	public void display() {
		System.out.println("Empid - " + empid);
		System.out.println("Salary - " + salary);
	}

}
