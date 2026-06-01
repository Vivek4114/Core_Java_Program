package com.nit.arrayProgram;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Prog6_LeftEleDPosition {

	public static void main(String[] args) {
		int arr[] = { 20, 60, 29, 10, 40 };
		int p = 2;

		for (int i = 0; i < p; i++) {
			int temp = arr[0];

			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];

			}

			arr[arr.length - 1] = temp;
		}

		System.out.println(Arrays.toString(arr));
		System.out.println("========useing Stream Api======");
		int arr1[] = {29,39,201,10,399};
		shifLeftElement(arr1, p);

	}

	public static void shifLeftElement(int arr[], int p) {

		int[] result = IntStream.concat(Arrays.stream(arr).skip(p), Arrays.stream(arr).limit(p)).toArray();
		System.out.println(Arrays.toString(result));
	}

}
