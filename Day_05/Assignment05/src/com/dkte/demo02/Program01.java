package com.dkte.demo02;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Employee e1 = new Employee();
		Employee e1 = new Employee(1, "Anil", "anil@gmail.com", 10000);
		e1.displayEmployee();

		Employee e2 = new Employee();
		e2.acceptEmployee(sc);
		e2.displayEmployee();
}
}