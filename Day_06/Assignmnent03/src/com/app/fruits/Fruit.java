package com.app.fruits;

import java.util.Scanner;

class Fruit {
	String color;
	double weight;
    String name;
    boolean isFresh;
    
    Scanner sc=new Scanner(System.in);
    
    public Fruit() {
    	
    }
    
	public Fruit(String color, double weight, String name, boolean isFresh) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	
	 public String taste() {
		 return "no specific taste";
	 }
    
	 
	 public String toString() {
		 return "Name ->"+name+"Color ->"+color+"Weight ->"+weight;
	 }
	 
	 public boolean isFresh() {	 
	       return this.isFresh; 
	 }
	 
	 public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	 
	 public void addFruit() {
		 System.out.println("\n Enter The Name Of Fruit:");
		 name=sc.nextLine();
		 System.out.println("Enter The Color Of Fruit:");
		 color=sc.nextLine(); 
		 System.out.println("Enter The Weight Of Fruit:");
		 weight=sc.nextDouble();
	 }
	 
	 public String getColor() {
		return color;
	}

	 public void setColor(String color) {
		 this.color = color;
	 }

	 public double getWeight() {
		 return weight;
	 }

	 public void setWeight(double weight) {
		 this.weight = weight;
	 }

	 public String getName() {
		 return name;
	 }

	 public void setName(String name) {
		 this.name = name;
	 }

	 public void displayFruit() {
		 System.out.println("\n  Name Of Fruit: "+name);
		 System.out.println("  Color Of Fruit: "+color);
		 System.out.println("  Weight Of Fruit: "+weight+" gm");
		if(isFresh) {
			System.out.println("  Fruit Is Fresh...!\n");
		}else {
			System.out.println("  Fruit Is Not Fresh...!\n");
		}
			 
	 }
	 
	 
	 
	 
	 
}
