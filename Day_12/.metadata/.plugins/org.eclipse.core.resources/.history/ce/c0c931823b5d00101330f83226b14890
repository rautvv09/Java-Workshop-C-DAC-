package com.sunbeam.p1;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

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

	// natural ordering
	@Override
	public int compareTo(Product o) {
		return this.pid - o.pid;
	}

}

public class Program03 {

	public static void main(String[] args) {

		class ProductPriceComparator implements Comparator<Product> {
			@Override
			public int compare(Product o1, Product o2) {
				return Double.compare(o2.price, o1.price);
			}
		}
		ProductPriceComparator priceComparator = new ProductPriceComparator();

		Queue<Product> products = new PriorityQueue<>(priceComparator);
		products.add(new Product(5, "Pen", 15));
		products.add(new Product(2, "Pencil", 5));
		products.add(new Product(4, "Book", 50));
		products.add(new Product(1, "Eraser", 8));
		products.add(new Product(3, "Ruler", 12));

		System.out.println("Product at front - " + products.peek());
		products.remove();
			System.out.println("After remove, Product at front - " +		 products.peek());
	}

	public static void main1(String[] args) {
		Queue<Product> products = new PriorityQueue<>();
		products.add(new Product(5, "Pen", 15));
		products.add(new Product(2, "Pencil", 5));
		products.add(new Product(4, "Book", 50));
		products.add(new Product(1, "Eraser", 8));
		products.add(new Product(3, "Ruler", 12));

		System.out.println("Product at front - " + products.peek());
		products.remove();
		System.out.println("After remove, Product at front - " + products.peek());
	}

}
