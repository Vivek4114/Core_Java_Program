package com.nit.String;


public class Program11_CountTheCharacter {

	public static void main(String[] args) {
		
		 
		String s1 = "abcddcbaabcd";
		
		boolean isCounted = false;
		for(int i = 0; i<s1.length(); i++) {
			int c = 0;
			
			for(int j = 0; j<i; j++) {
				
				if(s1.charAt(i) == s1.charAt(j)) {
					isCounted = true;
					break;
				}
			}
			
			
			if(!isCounted) {
				
				for (int j = 0; j < s1.length(); j++) {
					
					if(s1.charAt(i) == s1.charAt(j)) {
						c++;
					}
					
				}
				
				System.out.println(s1.charAt(i)+"--->"+ c);
			}
 		
		}
  
	}
}
