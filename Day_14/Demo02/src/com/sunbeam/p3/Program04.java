package com.sunbeam.p3;

import java.util.function.BinaryOperator;

public class Program04 {

	// sort(arr,Comparator<T> c)
	public static void doWork(Integer v1, Integer v2, BinaryOperator<Integer> op) {
		// some logic
		System.out.println("Result - " + op.apply(v1, v2));
	}

	public static void main(String[] args) {
		// non capturing lambda
		doWork(10, 20, (x, y) -> x + y);
		doWork(20, 10, (x, y) -> x - y);
		doWork(10, 20, (x, y) -> x * y);

	}

}
