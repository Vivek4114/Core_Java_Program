package com.nit.practice15quetion;

import java.util.Map;
import java.util.stream.Collectors;

 // Frequency of each word 
//String str = "banana";
// // {b=1, a=3, n=2}

public class Program21 {
	
	public static void main(String[] args) {
		 
		String str = "banana";

		Map<Character, Long> freq = str.chars()
		        .mapToObj(c -> (char) c)
		        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		System.out.println(freq); // {b=1, a=3, n=2}

		
	}

}
