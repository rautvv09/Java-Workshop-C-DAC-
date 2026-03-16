package com.dkte;
import java.util.*;

public class Vehicle {
	String name;
	String number;

	public Vehicle() {
	}

	public void acceptVehicle(Scanner sc) {
		System.out.print("Enter vehicle name - ");
		name = sc.nextLine();
		sc.nextLine();
		
		System.out.print("Enter vehicle number - ");
		number = sc.nextLine();
	}

	public void displayVehicle() {
		System.out.println("Vehicle name - " + name);
		System.out.println("Vehicle number - " + number);
	}
}
