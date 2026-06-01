package com.nit.arrayProgram;

import java.util.Arrays;

public class Program13_longestSubArray {
	public static void main(String[] args) {

		int arr[] = { 29, 30, 31,3, 20, 5, 2,4, 1, 10, 32, 33, 20, 20, 20, 10, 6, 34, 35, 36, 37 };
	 Arrays.sort(arr);
	 
	 System.out.println(Arrays.toString(arr));
		
		int k = 10;
		int length = 0;
		int start = 0;

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];

				if (sum == k) {
					int mlen = j - i + 1;

					if (mlen > length) {
						length = mlen;
						start = i;
					}

				}

			}
		}

		int result[] = new int[length];

		for (int i = 0; i < length; i++) {
			result[i] = arr[start + i];

		}

		System.out.println("MAx Length is : " + length);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

}
