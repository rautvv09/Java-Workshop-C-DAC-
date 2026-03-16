package com.dkte;

import java.util.Scanner;

public class Employee {

	int empid;
	double salary;
	
	public Employee(){
		
	}
	
	public Employee(int empid,double salary){
		this.empid=empid;
		this.salary=salary;
	}
	
	public void accept(Scanner sc) {
		System.out.println("Enter Employee ID:");
		empid=sc.nextInt();
		
		System.out.println("Enter Employee Salary:");
		salary=sc.nextDouble();	
	}
	
	public void display() {
		
		System.out.println(" Employee ID:"+empid);
		System.out.println("Employee Salary:"+salary);
		
	}
}
