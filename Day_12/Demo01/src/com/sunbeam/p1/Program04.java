package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product implements Comparable<Product> {
	int pid;
	String name;
	double price;

	public Product() {
	}

	public Product(int pid) {
		super();
		this.pid = pid;
	}

	public Product(int pid, String name, double price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
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

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}

	// natural ordering of the products (Ascending order of the pid)
	@Override
	public int compareTo(Product o) {
		return this.pid - o.pid;
	}

}

public class Program04 {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(5, "Pen", 15));
		products.add(new Product(2, "Pencil", 5));
		products.add(new Product(4, "Book", 50));
		products.add(new Product(1, "Eraser", 8));
		products.add(new Product(3, "Ruler", 12));

		 
	}

	public static void main3(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(5, "Pen", 15));
		products.add(new Product(2, "Pencil", 5));
		products.add(new Product(4, "Book", 50));
		products.add(new Product(1, "Eraser", 8));
		products.add(new Product(3, "Ruler", 12));

		System.out.println("Before Sorting -> ");
		for (Product product : products)
			System.out.println(product);

		Collections.sort(products);

		System.out.println("After Sorting -> ");
		for (Product product : products)
			System.out.println(product);
	}

	public static void main2(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(5, "Pen", 15));
		products.add(new Product(2, "Pencil", 5));
		products.add(new Product(4, "Book", 50));
		products.add(new Product(1, "Eraser", 8));
		products.add(new Product(3, "Ruler", 12));

		products.remove(new Product(1));
		products.remove(2);

		for (Product product : products)
			System.out.println(product);
	}

	public static void main1(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(5, "Pen", 15));
		products.add(new Product(2, "Pencil", 5));
		products.add(new Product(4, "Book", 50));
		products.add(new Product(1, "Eraser", 8));
		products.add(new Product(3, "Ruler", 12));

		for (Product product : products)
			System.out.println(product);

		System.out.println("product at index 2 = " + products.get(2));
		System.out.println("index of product with id 4 = " + products.indexOf(new Product(4)));

	}

}
