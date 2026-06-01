package com.nit.t2Darray;

public class Program4_SumOfRow {
	public static void main(String[] args) {

		int arr[][] = { { 10, 190, 180 }, { 230, 210, 290 }, { 390, 310, 330 } };

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			
			for (int j = 0; j < arr[i].length; j++) {

				sum += arr[i][j];

			}
			System.out.println(sum);
		}
	}

}
