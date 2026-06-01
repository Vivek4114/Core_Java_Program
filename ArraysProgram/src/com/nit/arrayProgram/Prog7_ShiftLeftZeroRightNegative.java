package com.nit.arrayProgram;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Prog7_ShiftLeftZeroRightNegative {

	public static void ShiftLeftZeroRightNegative(int[] arr) {

		int[] array = IntStream
				.concat(IntStream.concat(Arrays.stream(arr).filter(n -> n < 0), Arrays.stream(arr).filter(n -> n > 0)),

						Arrays.stream(arr).filter(n -> n == 0))
				.toArray();
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		int arr[] = { 40, -9, -30, 0, 39, 0, 29, 0, 1, 2, -39, 50, 0 };
		ShiftLeftZeroRightNegative(arr);

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] == 0 && arr[j] != 0) || (arr[i] > 0 && arr[j] < 0)) {
					System.out.println(Arrays.toString(arr));
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
