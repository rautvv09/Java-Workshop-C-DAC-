package com.dkte;

import java.util.Scanner;

public class program01 {
	
	public static double calculate(double miles,double cost,double avg) {
		return (miles/avg)*cost;
	}
	
	public static double totalcal(double fr,double fees,double tolls) {
		return (fr+fees+tolls);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Total miles driven per day.");
		double miles=sc.nextDouble();
		
		System.out.println("Enter Cost per gallon of gasoline");
		double cost=sc.nextDouble();
		
		System.out.println(" Average miles per gallon");
		double avg=sc.nextDouble();
		
		System.out.println("Enter Parking fees per day");
		int fees=sc.nextInt();

		System.out.println("Enter Tolls per day");
		int tolls=sc.nextInt();
		
		
		double fr=calculate(miles,cost,avg);
		System.out.println("Total Daily Driving Cost Is: "+totalcal(fr,fees,tolls));
		
		sc.close();
		
	}

}
