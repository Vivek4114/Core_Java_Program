package com.nit.String;

public class Prog3_CountVowel {
	
	public static void main(String[] args) {
		
		String s = "abcebiasddolsu";
		String str = s.toLowerCase();
		
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' ||  str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ) {
				count++;
			}
			
		}
		
		System.out.println(s + " contains the " + count + " Vowel");
		 
			
	}

}
