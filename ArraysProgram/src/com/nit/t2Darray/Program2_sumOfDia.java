package com.nit.t2Darray;

public class Program2_sumOfDia {
	public static void main(String[] args) {

		int arr[][] = { { 12, 3, 44, 22, 44 }, { 22, 33, 4, 22, 44 }, { 22, 35, 67, 22, 44 } };
 int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				if (i == j) {
					sum +=  arr[i][j];
				}

			}

		}

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		for (int i = 0; i < arr.length; i++) {

			sum += arr[i][arr.length - 1 - i] ; 

		}
		
		System.out.println("Sum of all Diagonal Element is : " + sum);

	}
}
