package com.nit.String;


public class Program13_AnagramChecker2 {

	public static void main(String[] args) {

		String s1 = "silemnt";
		String s2 = "listnen";

		if (s1.length() != s2.length()) {
			System.out.println("String is not anagram");
			return;

		}

		int count = 0;
		boolean isAnagram = false;

		for (int i = 0; i < s1.length(); i++) {

			count = count + s1.charAt(i);
			count = count - s2.charAt(i);

		}
		
		if(count == 0) {
			isAnagram = true;
			int c = 0;
			for (int i = 0; i < s1.length(); i++) {
				
				for (int j = 0; j < s2.length(); j++) {
					
					if(s1.charAt(i) == s2.charAt(j)) {
						c++;				 
					}
					
				}
				
				if(c == 0) {
					isAnagram = false;
					 break;
				}
				c = 0;
				
			}
			
		}
		if(isAnagram) {
			System.out.println("String is Anagram");
		}
		else {
			System.out.println("String is not Anagram");
		}
	}

}
