package com.nit.arrayProgram;

import java.util.Arrays;

public class Program13_repeatType {
	
	public static void main(String[] args) {
		int arr[] = {5,6,3,6,7,2,9,20,10,5,20,9,1,3};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int k = 30;
		int maxLength = 0;
		int start = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int sum  = 0;
			
			for (int j = i; j < arr.length; j++) {
				
				sum += arr[j];
				
				if(sum == k) {
					int length = j - i + 1;
					
					if(maxLength < length) {
						maxLength = length;
						start = i;				
					}
					
				}
				
			}
			
		}
		
		int result[] = new int[maxLength];
		for (int i = 0; i < maxLength; i++) {
			result[i] = arr[start + i];
		}
		System.out.println("max length is : " + maxLength);
		
		
		 for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
	}

}
