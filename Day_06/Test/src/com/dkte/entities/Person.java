package com.dkte.entities;

public class Person {

	int name;
	Date dob;
	
	public Person() {
		
	}

	public Person(int name, Date dob) {
		this.name = name;
		this.dob = dob;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
    public String toString() {
	    	 return "\nName:"+name+
	    			 "\nDate Of Birth:"+dob;
	     }
	
}
