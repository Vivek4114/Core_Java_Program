package com.nit.String;

public class Prog4_CountWordinString {
	
	public static void main(String[] args) {
		
		String str = "hellow my name is kiran Marotrao Kadam";
		
		String[] split = str.split(" ");
		 
		System.out.println( str + "  : : : Contains the "+split.length +" Words" );
		
		System.out.println("============================================");
		
		
		int count = 1;
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ' || str.charAt(i) == '\u0000') {
				count++;
			}
			
		}
		
		System.out.println(count);
		System.out.println("============================================");
		 			
	}

}
