package com.nit.String;

public class Program12_NonRepeatableChar {

	public static void main(String[] args) {
		
		 
		String str = "abcdba";
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			count = 0;int v=0;
			for (int j = 0; j < str.length(); j++) {
				
				if(str.charAt(i) == str.charAt(j)&&i<=j) 
					count++;
				if(str.charAt(i) == str.charAt(j)&&i>j)v++; 
					
	
				
			}
			
			 if(v==0&&count>=1) {
				 System.out.println(str.charAt(i));
			 }
				
		}
	 
	}

}
