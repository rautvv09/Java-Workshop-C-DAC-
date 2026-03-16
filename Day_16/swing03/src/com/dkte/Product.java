package com.dkte;

// POJO class -- Plain Old Java Object
//	Object of class holds domain specific data -- No business logic
//	Fields, Constructor(s), Getters/Setters, | Optional: toString(), equals(), hashCode()
public class Product {
	private int id;
	private String name;
	private double price;
	public Product() {
		this(0, "", 0.0);
	}
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}
