package com.nit.String;

public class Program18_CountTheDigitCharSpecialChar {
	public static void main(String[] args) {

		String s1 = "The quick brown fo23923u33@#$$#x jumps overLSJDF the lazy dogddd";
		int lower = 0;
		int upper = 0;
		int digit = 0;
		int special = 0;

		for (int i = 0; i < s1.length(); i++) {

			char ch = s1.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				lower++;
			} else if (ch >= 'A' && ch <= 'Z') {
				upper++;
			} else if (ch >= '0' && ch <= '9') {
				digit++;
			} else if(ch != ' '){
				special++;
			}

		}
		
		System.out.println("Lower is : " + lower);
		System.out.println("upper is : " + upper);
		System.out.println("digit is : " + digit);
		System.out.println("special is : " + special);

	}

}