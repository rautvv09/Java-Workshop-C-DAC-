package com.sunbeam;

//checked exception
class InvalidTimeException extends Exception {
	public InvalidTimeException() {
	}

	public InvalidTimeException(String message) {
		super(message);
	}

}

class Time {
	private int hrs;
	private int mins;

	public void setHrs(int hrs) throws InvalidTimeException {
		if (hrs < 0 || hrs > 23)
			throw new InvalidTimeException();// checked exception
		this.hrs = hrs;
	}

	public void setMins(int mins) throws InvalidTimeException {
		if (mins < 0 || mins > 59)
			throw new InvalidTimeException("mins should be between 0 and 59");
		this.mins = mins;
	}

	@Override
	public String toString() {
		return "Time [hrs=" + hrs + ", mins=" + mins + "]";
	}

}

public class Program02 {

	public static void main(String[] args) {
		Time t1 = new Time();
		try {
			t1.setHrs(20);
			t1.setMins(60);
			System.out.println(t1);
		} catch (InvalidTimeException e) {
			e.printStackTrace();
		}

	}

}
