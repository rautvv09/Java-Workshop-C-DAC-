package com.app.fruits;

class Mango extends Fruit {

	public Mango() {
		
	}

	public Mango(String color, double weight, String name, boolean isFresh) {
		super(color,weight,name,isFresh);
	}
	
	@Override
	public String taste() {
		return " Sweet ";
	}
	
	@Override
	 public String toString() {
		 return "Name ->"+name+"Color ->"+color+"Weight ->"+weight;
	 }
	
	
	
	
}