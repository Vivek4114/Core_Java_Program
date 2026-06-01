package com.nit.AdditionTask;

import java.util.ArrayList;
import java.util.List;

public class program2_insertData {
	public static void main(String[] args) {
		int[] arr = {15, 3, 7, 22, 5, 9, 12};
		
		 
		List<Integer> li = new ArrayList<>();
		
		for(int x : arr) {
			li.add(x);
		}
		
		li.forEach(System.out::println);
		
		
		 
	}

}
