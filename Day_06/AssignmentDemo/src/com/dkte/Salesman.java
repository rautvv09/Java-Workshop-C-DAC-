package com.dkte;
import java.util.Scanner;

public class Salesman extends Employee {

	double commision;
	int noofproducts;
	
	public Salesman() {
		
	}
	
	public Salesman(int empid,double salary,double commision,int noofproducts) {
		super(empid,salary);
		this.commision=commision;
		this.noofproducts=noofproducts;
		
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Commision is:"+commision);
		System.out.println("No Of Products:"+noofproducts);
	}
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Commision Per Product:");
		commision=sc.nextDouble();
		
		System.out.println("No Of Products:");
		noofproducts=sc.nextInt();
		
	}
	
	public void CalTotalCommision() {
		System.out.println("Total Commision:"+(commision*noofproducts));
	}
}
