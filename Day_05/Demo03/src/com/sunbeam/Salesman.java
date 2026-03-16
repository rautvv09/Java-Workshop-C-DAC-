package com.sunbeam;

import java.util.Scanner;

public class Salesman extends Employee {
	double commission;
	int noOfProducts;

	public Salesman() {
	}

	public Salesman(int empid, double salary, double commission, int noOfProducts) {
		super(empid, salary);
		this.commission = commission;
		this.noOfProducts = noOfProducts;
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter the products sold - ");
		noOfProducts = sc.nextInt();
		System.out.println("Enter commission per product - ");
		commission = sc.nextDouble();
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Total commission - " + (noOfProducts * commission));
	}

}
