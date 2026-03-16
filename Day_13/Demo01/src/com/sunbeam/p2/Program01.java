package com.sunbeam.p2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Product implements Comparable<Product> {
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

	// natural ordering of product on pid
	@Override
	public int compareTo(Product o) {
		return this.pid - o.pid;
	}

}

public class Program01 {

	public static void main(String[] args) {

		class ProductPriceComparator implements Comparator<Product> {
			@Override
			public int compare(Product o1, Product o2) {
				return Double.compare(o2.price, o1.price);
			}
		}

		ProductPriceComparator priceComparator = new ProductPriceComparator();

		Set<Product> products = new TreeSet<>(priceComparator);// on price in desc order
		products.add(new Product(5, "Pen", 15));
		products.add(new Product(2, "Pencil", 5));
		products.add(new Product(4, "Book", 50));
		products.add(new Product(1, "Eraser", 10));
		products.add(new Product(3, "Ruler", 12));
		products.add(new Product(3, "Ruler", 12));

		System.out.println("size of products - " + products.size());

		for (Product product : products)
			System.out.println(product);
	}

	public static void main1(String[] args) {
		Set<Product> products = new TreeSet<>();// natural ordering
		products.add(new Product(5, "Pen", 15));
		products.add(new Product(2, "Pencil", 5));
		products.add(new Product(4, "Book", 50));
		products.add(new Product(1, "Eraser", 10));
		products.add(new Product(3, "Ruler", 12));
		products.add(new Product(3, "Ruler", 12));

		System.out.println("size of products - " + products.size());

		for (Product product : products)
			System.out.println(product);
	}

}
