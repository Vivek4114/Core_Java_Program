package com.nit.arrayProgram;

import java.util.Arrays;

// 11. Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array? 
public class Program11_CountEle {

	public static void main(String[] args) {

		int arr[] = { 1, 1, 1, 1, 1, 1, 1,1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1 };

		int maxCount = 0;
		int currentCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				currentCount++;
			} else {

				if (maxCount < currentCount) {
					maxCount = currentCount;
				}
				currentCount = 0;
			}
		}

	 
		System.out.println(maxCount);

	}
}
