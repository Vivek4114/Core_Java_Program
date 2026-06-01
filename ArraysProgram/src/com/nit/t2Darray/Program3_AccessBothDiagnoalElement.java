package com.nit.t2Darray;

public class Program3_AccessBothDiagnoalElement {
	public static void main(String[] args) {
		
		int arr[][] = {{12,3,44}, {22,34,44}, {67,22,44}};
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				 if( i == j) {
					 System.out.print(arr[i][j]+"   ");
				 }
				
			}
			
			
		}
		System.out.println();
		
		for(int i =0 ; i<arr.length; i++) {
			System.out.print(arr[i][arr.length - 1 - i]+"  ");
		}
	}

}
