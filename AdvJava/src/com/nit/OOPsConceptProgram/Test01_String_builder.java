package com.nit.OOPsConceptProgram;

import java.util.Scanner;

public class Test01_String_builder {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the  Number How many You want to enter the Name : ");
		int n = sc.nextInt();
		sc.nextLine();
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringBuilder str = null;
		StringBuilder str2 = null;

		for (int i = 1; i <= n; i++) {

			if (i == 1) {
				str = sb.append("?");
			} else {
				str = sb.append(" , ?");
			}

		}
		System.out.println(str);
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter the Name ");
			
			String name = sc.next();
			
			
			if (i == 1) {
				str2 = sb2.append(name);
			} else {
				str2 = sb2.append(" , "+ name);
			}

		}

		System.out.println(str2);

	}

}
