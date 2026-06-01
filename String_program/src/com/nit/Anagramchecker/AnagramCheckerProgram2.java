package com.nit.Anagramchecker;

//import java.util.Arrays;

public class AnagramCheckerProgram2 {

	public static void main(String[] args) {

		String s1 = "silent";
		String s2 = "listen";

//		int arr1[] = { 037, 29, 399, 299 };
//		Arrays.sort(arr1);

		if (s1.length() != s2.length()) {
			System.out.println("String is not Anagaram");
			return;
		}

		boolean isAnagram = true;
		char arr[] = s2.toCharArray();

		for (int i = 0; i < s1.length(); i++) {

			boolean isFound = false;

			for (int j = 0; j < arr.length; j++) {

				if (s1.charAt(i) == arr[j]) {
					isFound = true;
					arr[j] = 0;
					break;
				}
			}

			if (!isFound) {
				isAnagram = false;
			}
		}

		if (isAnagram) {
			System.out.println("String is Anagram");
		} else {
			System.out.println("Stringis not Anagram");
		}

	}

}
