package com.dkte;

import java.util.Scanner;

public class Program01 {

	
	
	public static void main(String args[]) {
	
		Scanner sc=new Scanner(System.in);
		
//		
//		Employee e=new Employee();
//		e.accept(sc);
//		e.display();
//		
//		Manager m=new Manager();
//		m.accept(sc);
//		m.display();
//		
		Salesman s=new Salesman();
		s.accept(sc);
		s.display();
		s.CalTotalCommision();
		
		
			
	}
}
