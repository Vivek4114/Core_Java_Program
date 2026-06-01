package com.nit.Anagramchecker;

public class AnagramChecker {

	public static void main(String[] args) {

		String str1 = "silennt";
		String str2 = "listenn";

		if (str1.length() != str2.length()) {
			System.out.println("String are not Anagram");
			return;
		}
 
		 char[] lett  = str2.toCharArray();
		 
		 boolean isAnagram = true;
		 
		 for (int i = 0; i < str1.length(); i++) {
			 boolean isFound = false;
			 for (int j = 0; j < lett.length; j++) {
				 
				 if(str1.charAt(i) == lett[j]) {
					 isFound = true;
					 lett[j] = 0;
					 break;
					 
				 }
			}
			 
			 if(!isFound) {
				 isAnagram = false;
			 }
			}
		 
		 if(isAnagram) {
			 System.out.println("String is anagram");
		 }else {
			 System.out.println("String is not anagram");
		 }
	}
}
