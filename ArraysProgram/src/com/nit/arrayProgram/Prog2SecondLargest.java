package com.nit.arrayProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;

public class Prog2SecondLargest {
	
	public static void findSecondLargest(int arr[]) {
		
		OptionalInt max = Arrays.stream(arr)
				.distinct()
				.boxed()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.mapToInt(i -> i)
				.findFirst();
		System.out.println(max.getAsInt());
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {10,29,27,29,30,87,55};
		int max = arr[0];
		int secondMax = max;
		
		for(int i = 1; i<arr.length; i++) {
			
			if(max < arr[i]) {
				secondMax=max;
				max=arr[i];
			
				
			}else if(arr[i]>secondMax && arr[i] != max ) {
				secondMax  = arr[i];
			}
		}
		
		System.out.println(secondMax);
		findSecondLargest(arr);
	}

}
