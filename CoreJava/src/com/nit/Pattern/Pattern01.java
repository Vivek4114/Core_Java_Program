package com.nit.Pattern;

import java.util.Scanner;

public class Pattern01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();

		 
		for(int row = 1; row <= n; row++) {
			for(int sp = n-1; sp > 1; sp++) {
				System.out.print(" ");
			}
			
			for(int star = 1; star <= n; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

		

	}

}
