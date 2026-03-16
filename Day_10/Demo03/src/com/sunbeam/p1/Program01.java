package com.sunbeam.p1;

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

//	@Override
//	public int compareTo(Employee obj) {
//		if (this.empid > obj.empid)
//			return 5;
//		if (this.empid < obj.empid)
//			return -3;
//		return 0;
//	}

	@Override
	public int compareTo(Employee obj) {
		return this.empid - obj.empid;
	}

}

public class Program01 {

	public static void main(String[] args) {
		Employee e1 = new Employee(2, "Anil", 10000);
		Employee e2 = new Employee(3, "Mukesh", 20000);
		if (e1.compareTo(e2) > 0)
			System.out.println("e1 is greater");
		else if (e1.compareTo(e2) < 0)
			System.out.println("e2 is greater");
		else
			System.out.println("both are equal");

	}

}
