package com.nit.String;

import java.util.Arrays;

public class Program15_SwapUppToLower {
	public static void main(String[] args) {

		String s1 = "Rameshwaram Method To Be Treat";
		String s2 = "";

		for (int i = 0; i < s1.length(); i++) {

			char ch = s1.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				s2 = s2 + (char) (ch - 32);
			} else if (ch >= 'A' && ch <= 'Z') {
				s2 = s2 + (char) (ch + 32);
			} else {
				s2 += ch;
			}

		}

		System.out.println(s2);

		String str = "madam";
		String result = "";

		for (char ch : str.toCharArray()) {
			if (ch == 'a') {
				result = result + (char) (ch - 32);
			} else {
				result += ch;
			}

		}

		char[] charArray = str.toCharArray();
		System.out.println(Arrays.toString(charArray));
		System.out.println(result);

	}

}
