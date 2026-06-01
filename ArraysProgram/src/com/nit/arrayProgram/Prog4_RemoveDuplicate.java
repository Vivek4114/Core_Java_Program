package com.nit.arrayProgram;

import java.util.Arrays;

public class Prog4_RemoveDuplicate {
	public static void removeDupli(int arr[]) {
		System.out.println("useing Stream Api");
		Arrays.stream(arr).distinct().forEach(System.out::println);
		System.out.println("==========================");
	}
	
	public static void main(String[] args) {

		int arr[] = { 10, 29, 199, 10, 10, 30 };
		
		removeDupli(arr);
		
		for(int i = 0; i<arr.length; i++) {
			int c=0,v=0;
			for(int j = 0; j<arr.length; j++) {
				if(arr[i]==arr[j]&&i<=j)c++;
				if(arr[i]==arr[j]&&i>j)v++;
			}
			if(v==0&&c>=1) {
				System.out.println(arr[i]);
			}
		
		}
		
		//==============================================
		int n = arr.length;

		for(int i = 0; i < n; i++) {
		    boolean duplicate = false;
		    for(int j = 0; j < i; j++) {
		        if(arr[i] == arr[j]) {
		            duplicate = true;
		            break;
		        }
		    }
		    if(duplicate) {
		        // Shift elements left
		        for(int k = i; k < n - 1; k++) {
		            arr[k] = arr[k + 1];
		        }
		        n--;   // reduce array size
		        i--;   // check this index again
		    }
		}

		// Print result
		for(int i = 0; i < n; i++) {
		    System.out.print(arr[i] + " ");
		}
	}
	
	

}
