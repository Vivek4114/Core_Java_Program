package com.nit.practice15quetion;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

//. Given a sentence, find the occurrence of each word. 
//input: String s = "I am learning streams API in Java Java"; 
//output: {Java=2, in=1, streams=2, I=1, API=2, learning=3, am=1}

public class Program06 {
	
	public static void main(String[] args) {
		
		String s = "I am learning streams API in Java"; 
 
		  Map<String, Long> collect = Arrays
		  .stream(s.split(" "))
		 .collect(
				 Collectors.toMap(
						 e -> e,
						 v ->  v.chars()
						 .filter(m -> "aeiouAEIOU".indexOf(m) != -1 )
						 .count()
		 
		 ));
  System.out.println(collect);
	 
		
		 
	 
		
		
	 
		
	 
		
		
	}

}
