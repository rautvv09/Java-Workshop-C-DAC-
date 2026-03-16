package com.dkte;

public class Person {

	String name;
	Date dob;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return " Person [name=" + name + ", dob=" + dob + "]";
	}

	public Person(String name, Date dob) {
		this.name = name;
		this.dob = dob;
	}

	
}
