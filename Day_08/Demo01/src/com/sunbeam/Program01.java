package com.sunbeam;

// custom exception
//unchecked exception
class InvalidDateException extends RuntimeException {

	public InvalidDateException() {
	}

	public InvalidDateException(String message) {
		super(message);
	}
}

class Date {
	private int day;
	private int month;

	public void setDay(int day) {
		if (day <= 0 || day > 31)
			throw new InvalidDateException();
		this.day = day;
	}

	public void setMonth(int month) {
		if (month <= 0 || month > 12)
			throw new InvalidDateException("Month should be between 1 and 12");
		this.month = month;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + "]";
	}

}

public class Program01 {

	public static void main(String[] args) {
		Date d1 = new Date();
		d1.setDay(15);
		d1.setMonth(1);
		System.out.println(d1);
	}

}
