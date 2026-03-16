package com.sunbeam;

final class Date {
	private int day;
	private int month;
	private int year;

	public Date() {
	}

	final public void setDay(int day) {
		this.day = day;
	}

	public int getDay() {
		return day;
	}
}

class MyDate extends Date {

	@Override
	public void setDay(int day) {
		this.day = day;
	}
}

public class Program01 {

	public static void main(String[] args) {

	}

}
