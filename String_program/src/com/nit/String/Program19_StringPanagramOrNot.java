package com.nit.String;


public class Program19_StringPanagramOrNot {
	public static void main(String[] args) {

		String s1 = "The quick brown fox jumpsxx over the lazy dog".toLowerCase();
		 

		boolean isPana = true;

	 
			for (char ch1 = 'a'; ch1 <= 'z'; ch1++) {

				if (s1.indexOf(ch1) == -1) {
					// s2+=ch;
					isPana = false;
					break;
				}
			}
  
		if (isPana)
			System.out.println("String is panagram");
		else
			System.out.println("String is not pana ");
		
		
		
		System.out.println("===============================================");
		
		String s2 = "The quick brown fox jumpsxx over the lazy dog".toLowerCase();
		
		int count = 0;
		//System.out.println(s2.length());
		
		for(char ch = 'a'; ch<='z'; ch++) {
			
			if(s2.indexOf(ch) != -1) {
				count++;
				 
			}
		}
		
		if(count == 26) {
			System.out.println("String is panagram String ");
		}else {
			System.out.println("String is not panagram");
		}
		System.out.println("===============================================");
		
		
		

	}

}