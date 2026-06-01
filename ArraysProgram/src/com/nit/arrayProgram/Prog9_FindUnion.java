package com.nit.arrayProgram;

import java.util.Arrays;

public class Prog9_FindUnion {
	
	public static void findUnion(int arr1[], int arr2[]) {
		System.out.println("==========Steam Api++++++++++++++++++++++");
		
		 Arrays.stream(arr1).filter(i -> Arrays.stream(arr2).anyMatch(b -> b==i)).forEach(System.out::println);;
		 System.out.println("==========Steam Api++++++++++++++++++++++");
		 
		
	}

	public static void main(String[] args) {
		int arr1[] = { 20, 40, 50, 70, 90 };
		int arr2[] = { 10, 20, 30, 40, 50, 60 };
		 
		findUnion(arr1,arr2);
		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					 System.out.print(arr1[i]+ " ");
				}
			}

		}
		

	}

}
