package com.nit.arrayProgram;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Prog5_LeftRotateArray {

	public static void rotate1position(int arr[]) {
		System.out.println("=============By useing Stream Api================");
		int[] array = IntStream.concat(IntStream.of(arr).skip(1), IntStream.of(arr).limit(1)).toArray();

		System.out.println(Arrays.toString(array));

	}

	public static void main(String[] args) {
		 
		int arr[] = {10, 39, 209, 39, 29};

		
		System.out.println("left the psition of the element...!");

		int firstEle = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];

		}
		arr[arr.length - 1] = firstEle;

		System.out.println(Arrays.toString(arr));
		rotate1position(arr);

	}
}
