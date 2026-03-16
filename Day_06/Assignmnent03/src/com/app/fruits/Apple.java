package com.app.fruits;

class Apple extends Fruit {
		
	public Apple() {
		
	}
	
	public Apple(String color, double weight, String name, boolean isFresh) {
		super(color,weight,name,isFresh);
	}
	
	@Override
	public String taste() {
		return "Sweet n Sour";
	}
	
	
	@Override
	 public String toString() {
		 return " Name ->"+name+" Color ->"+color+" Weight ->"+weight;
	 }
	
}
