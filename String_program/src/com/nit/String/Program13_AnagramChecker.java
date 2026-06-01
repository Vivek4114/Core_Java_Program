package com.nit.String;


public class Program13_AnagramChecker {

	public static void main(String[] args) {
		
		 
		String s1 = "silent";
		String s2 = "listetn";
		
		if(s1.length() != s2.length()) {
			System.out.println("String is not anagram");
			return;
		 
				
		}
		
		boolean isAnagram = true;
		char sArr[] = s2.toCharArray();
		
		for   (int i = 0; i < s1.length(); i++) {
			boolean isFound = false;
			
			for (int j = 0; j < sArr.length; j++) {
				
				if(s1.charAt(i) == sArr[j]) {
					isFound = true;
					sArr[j] = 0;
					break;
				}
				
				
				
			}
			
			if(!isFound) {
				isAnagram = false;			 
			}
			
		}
		
		if(isAnagram) {
			System.out.println("String is Anagram");
		}else {
			System.out.println("String is not Anagram");
		}
	 
	}

}
