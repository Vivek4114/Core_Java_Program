package com.nit.Anagramchecker;

public class AnagramCheckerProgram1 {

	public static void main(String[] args) {
		String str1 = "silent";
		String str2 = "listen";

		if (str1.length() != str2.length()) {
			System.out.println("String is not " + " Anagram");
			return;
		}

		int count = 0;
		boolean isAnagram = false;

		for (int i = 0; i < str1.length(); i++) {
			count = count + str1.charAt(i);
			count = count - str2.charAt(i);
		}

		if (count == 0) {
			isAnagram = true;
			int c = 0;
			for (int i = 0; i < str1.length(); i++) {

				for (int j = 0; j < str2.length(); j++) {

					if (str1.charAt(i) == str2.charAt(j)) {
						c++;
					}

				}

				if (c == 0) {
					isAnagram = false;
					break;
				}

				c = 0;

			}

			if (isAnagram) {
				System.out.println("String is anagram");
			} else {
				System.out.println("String is not Anagram");
			}

		} else {
			System.out.println("String is not Anagram");
		}

	}

}
