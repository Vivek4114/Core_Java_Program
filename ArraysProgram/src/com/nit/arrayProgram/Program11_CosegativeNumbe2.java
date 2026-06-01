package com.nit.arrayProgram;

import java.util.Arrays;
import java.util.stream.Collectors;;

// 11. Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array? 
public class Program11_CosegativeNumbe2 {
	
	
	public static void findUsingStream(int arr[]) {
		System.out.println("===============Stream Api Aproach====================");
		
		String binaryString = Arrays.stream(arr)
							.mapToObj(String::valueOf)
							.collect(Collectors.joining());
		
		int max =  Arrays.stream(binaryString.split("0"))
				.mapToInt(String::length)
				.max()
				.orElse(0);
		
		System.out.println(max);
		
	 
	}

	public static void checkConsucative(int arr[]) {

		System.out.println("===============Check Con method  Aproach====================");

		int currentCount = 0;
		int maxCount = 0;

		for (int i = 0; i < arr.length -1; i++) {

			if (arr[i] == 1 && arr[i + 1] == 1) {
				currentCount++;
			}

			if ((arr[i] == 1 && arr[i + 1] == 0) ) {

				if (maxCount < currentCount) {
					maxCount = currentCount;
					currentCount = 0;
				}
			}

		}

		System.out.println(maxCount);

	}

	public static void main(String[] args) {

		int arr[] = { 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1 ,1,1};
		int arr2[] = new int[5];
		int count = 1;
		int val = 0;
		checkConsucative(arr);
		findUsingStream(arr);
		System.out.println("===============Another Aproach====================");

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] == 1 && arr[i + 1] == 1) {
				count++;
			}

			if (arr[i] == 1 && arr[i + 1] == 0) {
				arr2[val++] = count;
				count = 1;
			}

		}

		int temp = Arrays.stream(arr2).max().getAsInt();
		System.out.println(temp);
		System.out.println(Arrays.toString(arr2));

	}
}
