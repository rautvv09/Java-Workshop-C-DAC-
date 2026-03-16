package com.dkte;

class InvalidTimeException extends Exception{
	
	public InvalidTimeException(){
		
	}
	
	public InvalidTimeException(String message) {
		super(message);
	}
	

}

class Time{
	private int hrs;
	private int min;
	
	public int getHrs() {
		return hrs;
	}
	
	public void setHrs(int hrs) throws InvalidTimeException{
		if(hrs>23 || hrs<1) {
			throw new InvalidTimeException();
		}
		this.hrs = hrs;
	}
	
	public int getMin() {
		return min;
	}
	
	public void setMin(int min) throws InvalidTimeException {
		if(min>60|| min<1) {
			throw new InvalidTimeException("Minutes Must Be In Between Of The 1 To 60");
		}
		this.min = min;
	}

	@Override
	public String toString() {
		return "Time [hrs=" + hrs + ", min=" + min + "]";
	}
		
}


public class Program02 {

	public static void main(String args[]) {
		Time t1=new Time();
	try{
		t1.setHrs(5);
		t1.setMin(66);
		
	  }
	catch(Exception e) {
		e.printStackTrace();
	}
	System.out.println(t1);
	}
//	
}
