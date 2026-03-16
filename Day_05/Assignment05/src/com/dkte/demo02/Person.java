package com.dkte.demo02;

import java.util.Scanner;

public class Person {
	String name;
	String email;

	public Person() {
		System.out.println("Person()");
	}

	public Person(String name, String email) {
		System.out.println("Person(String,String)");
		this.name = name;
		this.email = email;
	}

	public void acceptPerson(Scanner sc) {
		System.out.print("Enter name - ");
		name = sc.next();
		System.out.print("Enter email - ");
		email = sc.next();
	}

	public void displayPerson() {
		System.out.println("Name - " + name);
		System.out.println("Email - " + email);
	}

}

