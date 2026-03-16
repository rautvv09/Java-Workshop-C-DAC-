package com.dkte;

public class Date {

	int day;
	int month;
	int year;
	
	public Date() {
		
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day)throws Exception  {
		if(day>31 || day<=0)
			throw new Exception("Invalid Day....");
		this.day = day;
	}

	public int getMonth() {
		
		return month;
	}

	public void setMonth(int month)throws Exception  {
		if(month<=0 || month>12)
			throw new Exception("Invalid Month...");
		this.month = month;
	}

	@Override
	public String toString() {
		return " Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) throws Exception{
		if(year>3000 || year<2000)
			throw new Exception("Invalid Year.....");
		this.year = year;
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

}
