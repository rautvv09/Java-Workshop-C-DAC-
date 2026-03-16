package com.dkte.service;

import com.dkte.entities.Person;

public class PerService {

	public void displayPerson(Person p) {
		System.out.println("Name:"+p.getName());
		System.out.println("Date Of Birth:"+p.getDob());
	}
		
	
}
