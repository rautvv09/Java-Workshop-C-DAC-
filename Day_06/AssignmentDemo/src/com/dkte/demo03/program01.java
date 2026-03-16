package com.dkte.demo03;

import java.util.Scanner;

final class Date{
	int day;
	int month;
	int year;
	
	
	public Date(){
		System.out.println("Inside The Non Parameterized Constructor");
	}
	
	public Date(int day,int month,int year) {
		System.out.println("Inside The Parameterized Constructor");
		this.day=day;
		this.month=month;
		this.year=year;	
	}
	
	
	public void setDay(int day) {
		System.out.println("Inside Setter");
		this.day=day;
	}
	
	public int getDay() {
		return day;
	}
	
	public void displayDate() {
		System.out.println("Date Is:"+ day +"/"+ month +"/"+ year);
	}
	
	public void accept(Scanner sc) {
		System.out.println("Day Is:");
		day=sc.nextInt();
		
		System.out.println("Month Is:");
		month=sc.nextInt();
		
		System.out.println("Year Is:");
		year=sc.nextInt();
	}
	
}
//We Cannot Inheriate the Final Class In Another Classes

//class myDate extends Date{
//	@Override
//	public void setDay(int day) {
//		System.out.println("Inside Setter In Overriden");
//		this.day=day;
//	}
//}
public class program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		Date d=new Date();
		d.accept(sc);
		d.displayDate();
		
		Date d2=new Date();
		d2.setDay(4);
		d2.displayDate();
	}

}
