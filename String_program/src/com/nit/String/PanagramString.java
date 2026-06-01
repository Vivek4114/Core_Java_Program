package com.nit.String;

public class PanagramString {
	
	public static void main(String[] args) {
		
		String  str = "abcdefghijklmnopqrstuabcwxyz".toLowerCase();
		
		boolean flag = true;;
		//int count = 0;
		 
			
			for(char ch = 'a'; ch<='z'; ch++ ) {
				if(str.indexOf(ch)==-1 ) {
					 flag = false;
					 break;
				}
			}
	 
		
		if(flag) {
			System.out.println("String contain all letter");
		}else {
			System.out.println("String not contain all letter");
			
		}
		
	}

}
