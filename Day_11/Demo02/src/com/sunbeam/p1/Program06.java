package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.Collection;

class Employee {
	int empid;
	String name;
	double salary;

	public Employee() {
	}

	public Employee(int empid) {
		this.empid = empid;
	}

	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (obj instanceof Employee) {
			Employee e = (Employee) obj; // Downcasting
			if (this.empid == e.empid)
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class Program06 {

	public static void main(String[] args) {
		Collection<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "Anil", 10000));
		empList.add(new Employee(2, "Mukesh", 20000));
		empList.add(new Employee(3, "Ramesh", 30000));
		empList.add(new Employee(4, "Suresh", 40000));
		empList.add(new Employee(5, "Ram", 50000));

		System.out.println("empList.remove(4) - " + empList.remove(new Employee(4)));

		for (Employee e : empList)
			System.out.println(e);

		// System.out.println("empList.contains(3) - " + empList.contains(new
		// Employee(3)));
		// System.out.println("empList.contains(7) - " + empList.contains(new
		// Employee(7)));

	}

}
