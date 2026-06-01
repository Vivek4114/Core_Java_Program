package com.nit.arrayProgram;

import java.util.Arrays;

public class reverse_array {

	public static void main(String[] args) {

		int arr[] = { 19, 239, 39, 49, 28, 93 };
		
	  

		int start =  0;
		int end = arr.length-1;
		 
		 
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	System.out.println(	Arrays.toString(arr));

	}

}
