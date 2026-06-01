package com.nit.Dec5;

import java.util.stream.Stream;

public class TerminalOperation {
	public static void main(String[] args) {
		
		 Stream<String> stream = Stream.of("Vivek"); // returning stream contain one element
		 stream.forEach(System.out::println);
		
	}

}
