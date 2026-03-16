package com.dkte;

public class Employee extends Person{

	int id;
	String dept;
	double salary;
	Date doj;
	
	public Employee() {

	}

	public Employee(String name,Date dob,int id, String dept, double salary, Date doj) {
		super(name,dob);
		this.id = id;
		this.dept = dept;
		this.salary = salary;
		this.doj = doj;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}
	
	@Override
	public String toString() {
		return " Employee [id=" + id + ", dept=" + dept + ", salary=" + salary + ", doj=" + doj + ", name=" + name
				+ ", dob=" + dob + "]";
	}


}
