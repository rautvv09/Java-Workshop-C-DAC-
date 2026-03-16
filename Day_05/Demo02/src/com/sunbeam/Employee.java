package com.sunbeam;

import java.util.Scanner;

//Employee is-a Person
public class Employee extends Person {
	int empid;
	double salary;

	public Employee() {
		System.out.println("Employee()");
	}

	public Employee(int empid, String name, String email, double salary) {
		super(name, email);
		System.out.println("Employee(int,String,String,double)");
		this.empid = empid;
		this.salary = salary;
	}

	public void acceptEmployee(Scanner sc) {
		System.out.print("Enter empid - ");
		empid = sc.nextInt();
		acceptPerson(sc);
		System.out.print("Enter salary - ");
		salary = sc.nextDouble();
	}

	public void displayEmployee() {
		System.out.println("Empid - " + empid);
		displayPerson();
		System.out.println("Salary - " + salary);
	}
}
