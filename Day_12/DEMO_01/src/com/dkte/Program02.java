package com.dkte;

import java.util.ArrayList;
import java.util.List;

public class Program02 {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<>();
		
		l1.add("Raj");
		l1.add("Shiv");
		l1.add("Stive");
		l1.add("Smith");
		l1.add("Thor");
		l1.add("Shiv");
		l1.add("Ashwin");
		l1.add("Harshad");
		
		System.out.println("Element At Index 4 is : "+l1.get(4));
		System.out.println("Index of Thor :"+l1.indexOf("Thor"));
		System.out.println("Index of Harshad :"+l1.indexOf("Stive" ));
		System.out.println("Index of Arshad :"+l1.indexOf("Arshad"));
		System.out.println("Last Index of Shiv :"+l1.lastIndexOf("Shiv"));
		

	}

}
