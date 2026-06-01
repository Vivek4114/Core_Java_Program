package com.nit.arrayProgram;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Prog3ArraySortedChecker {
	public static void main(String[] args) {
		
		int arr[] = { 10, 20, 28 ,34,39};
		
		
		boolean check = checkArray(arr);
		
		if(check) {
			System.out.println("array is sorted..");
		}else{
			System.out.println("Array is not Sorted..!");
		}
		
	}
	
	
	
	public static void checkUseingStream(int arr[]) {
		
		IntStream sorted = Arrays.stream(arr);
	}

	public static boolean checkArray(int  arr[]) {

		 
		for(int i = 0; i<arr.length-1; i++) {
			
			if(arr[i] >  arr[i+1] ) {
			 return false;
			}
			 		
		}
				
		return true;
	}

}
