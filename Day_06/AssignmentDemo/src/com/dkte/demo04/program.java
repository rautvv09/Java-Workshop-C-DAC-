package com.dkte.demo04;

import java.util.Scanner;

import com.dkte.Employee;
import com.dkte.demo02.Manager;


public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Employee e=new Employee();
		e.accept(sc);
		e.display();
		
		Manager m=new Manager();
		m.accept(sc);
		m.display();
		
	}

}
