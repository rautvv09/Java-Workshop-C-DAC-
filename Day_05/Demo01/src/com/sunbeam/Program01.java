package com.sunbeam;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee();
		e1.displayEmployee();

		Employee e2 = new Employee();
		e2.acceptEmployee(sc);
		e2.displayEmployee();

	}

}
