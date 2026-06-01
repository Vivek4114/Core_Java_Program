package com.nit.arrayProgram;

import java.util.Arrays;
import java.util.Iterator;

public class Program10_FindMissingNumber {

	public static void main(String[] args) {
		 int arr[] = {1,2,4,5};
		 int exactsum = 0;
		 int n = 5;
		 int actualSum =  n * (n+1)/2;
		 
		 for (int i = 0; i < arr.length; i++) {
			 exactsum += arr[i];
		} 
		 
		 int missingNum = actualSum - exactsum;
		 System.out.println(missingNum);
		 
		 System.out.println("===========================");
		 
		 int sum = Arrays.stream(arr).sum();
		 
		int result = actualSum - sum;
		System.out.println(result);
		
		

	}

}
