package com.dkte.demo02;

class Date{
	int day;
	int month;
	int year;
	
	public Date() {
		
	}
	
	public Date(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;		
	}
	
	@Override
	public String toString() {
		return day+"/"+month+"/"+year;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}
		if(this==obj) {
			return true;
		}
		if(obj instanceof Date) {
			Date d2=(Date) obj;
			if(this.day==d2.day && this.month==d2.month && this.year==d2.year) {
				return true;
			}
		}
		
		return false;	
	}
}

public class Program01 {

	public static void main(String args[]) {
		Date d1=new Date(1,3,2005);
		Date d2=new Date(1,3,2005);
		
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		System.out.println("(d1==d2)= "+ (d1==d2));	
		System.out.println("d1.equals(d2)= "+ (d1.equals(d2)));
		System.out.println("(d1.equals(vinay))= "+ (d1.equals("vinay")));
		
	}
	
}
