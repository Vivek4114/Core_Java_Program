package com.nit.practice15quetion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

 //2. Find Duplicate Elements in a List
//List<Integer> list = Arrays.asList(1,2,3,2,4,5,1,6);
//output : [1, 2]

public class Program18 {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,2,4,5,1,6);

		Set<Integer> duplicates = list.stream()
		        .filter(n -> Collections.frequency(list, n) > 1)
		        .collect(Collectors.toSet());

		System.out.println(duplicates); // 
	 
		
	}

}
