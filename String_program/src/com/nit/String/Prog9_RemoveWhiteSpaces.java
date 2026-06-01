package com.nit.String;

public class Prog9_RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		String str = " hello my name is vivek";
		
//		for (int i = 0; i < str.length(); i++) {
//			 
//			
//			if(str.charAt(i)== ' ') {
//				 str.replace(" ", "");
//			}
//			
//		}
		
		
		str=str.replace(" ", "");
		
		System.out.println(str);
		 
		
	}

}
