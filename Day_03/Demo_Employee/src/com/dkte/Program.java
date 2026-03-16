package com.dkte;

import java.util.Scanner;

class Employee{
	private int empid;
	private String name;
	private double salary;
	
	public Employee() {
		
	}
	
	public Employee(int empid,String name,double salary) {
		this.empid=empid;
		this.name=name;
		this.salary=salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		if(empid<0) {
			return;
		}
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void acceptEmployee(Scanner sc) {
		
		System.out.println("\nEnter The Employee Name:");
		name=sc.next();
		
		System.out.println("\nEnter The Employee ID:");
		empid=sc.nextInt();
		
		System.out.println("\nEnter The Employee Salary:");
		salary=sc.nextDouble();
		
	}
	
	public void displayEmployee() {
		System.out.println("----------------------------------");
		System.out.println("Enter The Employee ID:"+empid);
		System.out.println("Enter The Employee Name:"+name);
		System.out.println("Enter The Employee Salary:"+salary);
		System.out.println("----------------------------------");
	}
	
}
public class Program {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Number Of Employees To Insert:");
		int n=sc.nextInt();
		
		Employee[] emp=new Employee[n];
		
		for(int i=0;i<n;i++) {
			emp[i]=new Employee();
			emp[i].acceptEmployee(sc);		
		}
		
		for(int i=0;i<n;i++) {
			emp[i].displayEmployee();		
		}

	}

}
