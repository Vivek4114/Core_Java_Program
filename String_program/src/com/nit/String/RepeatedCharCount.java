package com.nit.String;

public class RepeatedCharCount {
	public static void main(String[] args) {
		
		String s1 = "abcdeaba";
		boolean isCounted = false;
		for (int i = 0; i < s1.length()-1; i++) {
			
			for(int j = 0; j<i; j++) {
				if(s1.charAt(i) == s1.charAt(j)) {
				isCounted = true;
				break;
				}
			}
			
			if(!isCounted) {
				
				int count  = 0;
				for (int j = 0; j < s1.length(); j++) {
					count = 0;
					if(s1.charAt(i) == s1.charAt(j)) {
						count++;
					}
					
					
				
					
				}
				
				System.out.println(s1.charAt(i) +" ----> "+ count);
			}
			
		}
		
		
	}
}
