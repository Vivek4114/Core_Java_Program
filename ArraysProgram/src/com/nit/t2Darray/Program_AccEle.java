package com.nit.t2Darray;

public class Program_AccEle {
	public static void main(String[] args) {

		int arr[][] = { { 10, 20, 30 },
						{ 40, 60, 80 },
						{ 59, 29, 40 }};
	 

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				if (i == j) {
					System.out.print(arr[i][j]+ "  ");
				}

			}


		}

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		for (int i = 0; i < arr.length; i++) {

				  System.out.print(arr[i][arr.length - 1 - i]+ "  ");
			 


		}

	}

}
