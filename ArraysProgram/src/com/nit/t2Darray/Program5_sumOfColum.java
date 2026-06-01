package com.nit.t2Darray;

public class Program5_sumOfColum {
	public static void main(String[] args) {

		int arr[][] = { { 10, 20, 30 }, { 40, 50, 60, 40, 20 }, { 70, 80, 90 }, { 100, 110, 120 } };

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;

			for (int j = 0; j < arr.length; j++) {

				sum += arr[j][i];

			}
			System.out.println(sum);
		}
	}

}
