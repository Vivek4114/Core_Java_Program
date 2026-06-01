package com.nit.StreamApi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
// WAP to create a list of words. Convert each one of them into UpperCase
//and then Display

public class Test03_ConvertWords {
	public static void main(String[] args) {
		 Stream.of("albatross", "Rainbow", "Developer", "Dabba Developer")
		
	   .map(e -> e.toUpperCase()).collect(Collectors.toList())
	
       .forEach(System.out::println);
		
		
	}

}

// map(): it applies a given function to each element of the stream and 
//return a stream containing the transformed elements.



