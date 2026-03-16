package com.sunbeam;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

class Product {
	int pid;
	String name;
	double price;

	public Product() {
	}

	public Product(int pid, String name, double price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(pid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Product))
			return false;
		Product other = (Product) obj;
		return pid == other.pid;
	}

}

public class Program03 {

	public static void main(String[] args) {
//		Set<Product> products = new HashSet<>();
		Set<Product> products = new LinkedHashSet<>();
		products.add(new Product(5, "Pen", 15));
		products.add(new Product(2, "Pencil", 5));
		products.add(new Product(4, "Book", 50));
		products.add(new Product(1, "Eraser", 10));
		products.add(new Product(3, "Ruler", 12));
		products.add(new Product(3, "Ruler", 12)); // product cannot be be duplicated
		// for checking the duplicate objects we need to override the
		// hashcode and equals method.

		System.out.println("size of products - " + products.size());

		for (Product product : products)
			System.out.println(product);
	}

}
