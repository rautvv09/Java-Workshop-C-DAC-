package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Employee implements Comparable<Employee> {
	int empid;
	String name;
	double salary;

	public Employee() {
	}

	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

	// natural ordering of the employees based on empid
	@Override
	public int compareTo(Employee obj) {
		return this.empid - obj.empid;
	}

}

public class Program01 {

	public static void display(Employee[] arr) {
		for (Employee e : arr)
			System.out.println(e);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee[] arr = new Employee[5];
		arr[0] = new Employee(5, "Ramesh", 50000);
		arr[1] = new Employee(3, "Anil", 20000);
		arr[2] = new Employee(4, "Mukesh", 10000);
		arr[3] = new Employee(1, "Suresh", 40000);
		arr[4] = new Employee(2, "Ram", 30000);
		System.out.println("Before Sorting - ");
		display(arr);

		System.out.println("1. Sort n display employees on empid");
		System.out.println("2. Sort n display employees on name");
		System.out.println("3. Sort n display employees on salary");
		System.out.println("Enter your choice - ");
		int choice = sc.nextInt();

		class EmpNameComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee obj1, Employee obj2) {
				return obj1.name.compareTo(obj2.name);
			}
		}
		EmpNameComparator empNameComparator = new EmpNameComparator();

		class EmpSalaryComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee o1, Employee o2) {
				return Double.compare(o1.salary, o2.salary);
			}
		}
		EmpSalaryComparator empSalaryComparator = new EmpSalaryComparator();

		switch (choice) {
		case 1:
			Arrays.sort(arr);
			break;
		case 2:
			Arrays.sort(arr, empNameComparator);
			break;
		case 3:
			Arrays.sort(arr, empSalaryComparator);
			break;
		}
		System.out.println("After Sorting - ");
		display(arr);
		
		sc.close();
	}

}
