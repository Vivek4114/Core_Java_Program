package com.nit.StreamApi;

import java.util.stream.Stream;

public class Test01 {
	/* Write a program to genereate Stream of multiple name and display them*/
	
	public static void main(String[] args) {
		Stream<String> names = Stream.of("Akashay", "john", "Hritik", "Rajpal", "Bobby");
		names.forEach(System.out::println);
				
	}

}


// of method is used to create stream of element 