	package com.sunbeam;

import java.util.Scanner;

interface Acceptable {
	void accept(Scanner sc); // by default they are public abstract
}

interface Displayable {
	void display();
}

class Date implements Acceptable, Displayable {
	int day;
	int month;
	int year;

	@Override
	public void accept(Scanner sc) {
		System.out.println("Date ::accept");
	}

	@Override
	public void display() {

	}

}

class Time implements Acceptable {
	int hr;
	int min;

	@Override
	public void accept(Scanner sc) {
		System.out.println("Time::accept");
	}

}

class Employee implements Acceptable, Displayable {

	@Override
	public void accept(Scanner sc) {
		System.out.println("Employee::accept");
	}

	@Override
	public void display() {

	}

}

public class Program01 {

	public static void main(String[] args) {
		Acceptable a1;
		a1 = new Date();
		a1 = new Time();
		a1 = new Employee();
	}

}
