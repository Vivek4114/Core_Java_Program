package com.nit.String;

public class Prog7_FindFreqOfChar {

	public static void main(String[] args) {
		String str = "sldjfslfjsldfjdsjfklsdjfklsd";

		char ch = 's';
		int c = 0;
		
		for (int i = 0; i < str.length(); i++) {
			 
			if(ch == str.charAt(i)) {
				c++;
			}
			
		}
		
		System.out.println("Frequency of the given  '"+ ch + "'   Char " + c);
	}

}
