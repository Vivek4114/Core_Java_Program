package com.nit.staticContext;

public class Program01 {

	public static void main(String[] args) {

		int x = 20;
		System.out.println("Main method: " + x);
	}

	static {

		int x = 10;
		System.out.println("Static block: " + x);
	}

}
