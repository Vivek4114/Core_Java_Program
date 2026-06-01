package com.nit.arrayProgram;

// 12. Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.
public class Program12_CountEleOnesAppear {

	public static void main(String[] args) {

		int arr[] = { 19, 39, 75, 10, 19, 39, 75, 7, 10 };

		for (int i = 0; i < arr.length; i++) {
			 int c = 0, v = 0;

			for (int j = 0; j < arr.length; j++) {
				if(arr[i]== arr[j] && i >= j)
					c++;
				if(arr[i]==arr[j] && i < j)
					v++;
				  
			}

			if (c >= 1 && v == 0 ) {
					System.out.println(arr[i]);
			}
		}

	}

}
