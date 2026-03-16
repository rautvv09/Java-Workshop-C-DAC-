package com.sunbeam.p1;

// interface that contains SAM is called as an functional interface

@FunctionalInterface
interface Acceptable {
	void accept(); // Single Abstract Method

	default void display() {
	}
}

public class Program01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
