package com.nit.practice15quetion;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//11.  Given a string, find the first non-repeated character.  
//input: String s = "Hello World"; 
//output: H
 
public class Program13 {
	
	public static void main(String[] args) {
		
		String s = "Hello World"; 
		
		 
		 String result = Arrays
		 .stream(s.split(""))
		 .collect(
			Collectors.groupingBy(
					e->e,
					LinkedHashMap::new,
					Collectors.counting()
					
					)	 
				 )
		 		.entrySet()
		 		.stream()
		 		.filter( e-> e.getValue() == 1)
		 		.map(Map.Entry::getKey)
		 		.findFirst()
		 		.get();
		
		 System.out.println(result);
		 
		
	   
	 
		
	}

}
