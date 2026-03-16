package com.sunbeam;

class Date {
	int day;
	int month;

	public void setDay(int day) {
		if (day <= 0 || day > 31)
			throw new RuntimeException(); // (uncheckd exception )generate an exception
		this.day = day;
	}

	public void setMonth(int month) throws Exception {
		if (month <= 0 || month > 12)
			throw new Exception(); // checked exception
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
		d1.setDay(20);
		try {
			d1.setMonth(20);
			System.out.println(d1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
