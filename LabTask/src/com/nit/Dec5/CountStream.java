package com.nit.Dec5;

import java.util.stream.Stream;

//Write a program to create a String With no Element Count And Display The String.
//empty(): Return a empty stream.
public class CountStream {
	public static void main(String[] args) {
		Stream stream = Stream.empty();
		System.out.println("Empty Stream Created.");
		System.out.println("Stream Created. "+stream.count());
	}

}
