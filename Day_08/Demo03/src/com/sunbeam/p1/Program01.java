package com.sunbeam.p1;

class Person implements  {
	String name;
	String address;

	public Person() {
	}

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

public class Program01 {

	public static void main(String[] args) {

		try {
			Person p1 = new Person("Anil", "Mumbai");
			Person p2 = (Person) p1.clone(); // Downcasting
			System.out.println("p1 - " + p1);
			System.out.println("p2 - " + p2);

			p2.name = "Mukesh";
			System.out.println("After change in p2 -> ");

			System.out.println("p1 - " + p1);
			System.out.println("p2 - " + p2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}
