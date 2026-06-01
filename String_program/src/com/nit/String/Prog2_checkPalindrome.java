package com.nit.String;

public class Prog2_checkPalindrome {
	
	public static void main(String[] args) {
		
		String str = "abcba";
		String str2 = "";
		
		for(int i = str.length() - 1; i >= 0; i--) {
			str2 += str.charAt(i);
		}
		
		if(str.equals(str2))
			System.out.println(str + " is palindrome String ");
		else
			System.out.println(str + " is  not palindrome String ");
			
	}

}
