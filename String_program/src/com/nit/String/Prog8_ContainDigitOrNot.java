package com.nit.String;

public class Prog8_ContainDigitOrNot {

	public static void main(String[] args) {
		
		String str = "9742937234829";
		int len = str.length();
		int count = 0;
		
		String[] split = str.split("");
		
		
		for(int i = 0; i < str.length(); i++) {
			
			if(split[i].matches("\\d")) {
				count++;
			}
		 	 
			 
		}
		
		if(count == len) {
			System.out.println("The String contain Only Digit");
		}else {
			System.out.println("The String Does not Contain Only Digit");
			
		}
		 
		System.out.println("=========================================");
		
		boolean onlyDigit = true;
		for (int i = 0; i < str.length(); i++) {
			
			if(!Character.isDigit(str.charAt(i))){
				onlyDigit = false;
				break;
			}
			
		}
		
		if(onlyDigit) {
			System.out.println("The String contain only Digit");
		}else {
			
			System.out.println("The String does not contain only Digit");
		}
	
		
		
	}

}
