//package com.sunbeam.p2;

import java.util.Arrays;

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

	// Sorting on empid
//	@Override
//	public int compareTo(Employee o) {
////		return this.empid - o.empid;
//		return o.empid - this.empid;
//	}

	// Sorting on name
//	@Override
//	public int compareTo(Employee o) {
////		return this.name.compareTo(o.name);
//		return -(this.name.compareTo(o.name));
//	}

	// sorting on the salary
	@Override
	public int compareTo(Employee o) {
//		return Double.compare(this.salary, o.salary);
		return Double.compare(o.salary, this.salary);
	}
}

public class Program01 {

	public static void main(String[] args) {
		Employee[] arr = new Employee[5];
		arr[0] = new Employee(5, "Mukesh", 10000);
		arr[1] = new Employee(3, "Anil", 50000);
		arr[2] = new Employee(2, "Suresh", 20000);
		arr[3] = new Employee(1, "Ram", 40000);
		arr[4] = new Employee(4, "Ramesh", 30000);

		System.out.println("Before sorting - ");
		for (Employee employee : arr)
			System.out.println(employee);

		Arrays.sort(arr);

		System.out.println("After sorting - ");
		for (Employee employee : arr)
			System.out.println(employee);
	}

}
