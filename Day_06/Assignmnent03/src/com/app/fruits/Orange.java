package com.app.fruits;

class Orange extends Fruit {

	public Orange() {
		
	}

	public Orange(String color, double weight, String name, boolean isFresh) {
		super(color,weight,name,isFresh);
	}
	
	@Override
	public String taste() {
		return " Sour ";
	}
	
	@Override
	 public String toString() {
		 return "Name ->"+name+"Color ->"+color+"Weight ->"+weight;
	 }
	
}
