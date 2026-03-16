package com.dkte.p1;
class Employee{
	
	int empid;
	String name;
	Double salary;
	
	public Employee() {
		
	}
	
	public Employee(int empid, String name, Double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}
	
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}


	
	
}
public class Program01 {

	public static void main(String[] args) {
		

	}

}
