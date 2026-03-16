package com.dkte;

import java.util.List;

// java8-> interfaces are mutable
interface Acceptable {
	void accept(); // public abstract

	default void display() {
		System.out.println("Acceptable::display");
	}

	// helper method
	static <T> void sort(List<T> l1) {

	}
}

//interface Displayable {
//	void display();
//}

class Employee implements Acceptable {
	@Override
	public void accept() {
		System.out.println("Employee::accept");
	}

	@Override
	public void display() {
		System.out.println("Employee::Display");
	}
}

class Time implements Acceptable {
	@Override
	public void accept() {
		System.out.println("Time::accept");
	}
}

class Product implements Acceptable {
	@Override
	public void accept() {
		System.out.println("Product::accept");
	}

	@Override
	public void display() {
		System.out.println("Product::display");
	}
}

public class Program01 {
	public static void main(String[] args) {
		Acceptable acceptable;
		acceptable = new Employee();
//		acceptable = new Time();
//		acceptable = new Product();

		acceptable.accept();
		acceptable.display();

	}

}
