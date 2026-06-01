package com.nit.t2Darray;

public class Travere_useing_3_D_Array {

	public static void main(String[] args) {
		int arr[][][] = { { { 10, 20, 40 }, { 190, 39, 10 } }, { { 129, 3409, 19 }, { 29, 39, 49 } },{ { 129, 3409, 19 }, { 29, 39, 49 } } };

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				for (int j2 = 0; j2 < arr[i][j].length; j2++) {
					
					System.out.print(arr[i][j][j2]+ "  ");

				}
				System.out.println();

			}
			System.out.println();

		}
	}

}
