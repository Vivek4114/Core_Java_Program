package com.nit.program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapExample {

	public static void main(String[] args) {
//		List<String> asList = Arrays.asList("Sachin", "Surya", "Tilak", "Ravi");
//		List<String> asList2 = Arrays.asList("Rohit", "Virat", "Mahindra","Shehwag");
//		
//		List<List<String>> asList3 = Arrays.asList(asList,asList2);
//		
//		List<String> list2 = asList3.stream().flatMap(list -> list.stream()).toList();
//		
//		System.out.println(list2);
		
		
		List<String> list = Arrays.asList("Jaya","Aryan","Virat","Akash");
		List<Character> list2 = list.stream().flatMap(str -> Stream.of(str.charAt(0))).toList();
		System.out.println(list2);
	}
}
