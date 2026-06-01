package com.nit.String;

public class General_Program {

	/*
	 * 1. Count the number of words in a string. 2. Remove duplicate characters from
	 * a string. 3.Find the first non-repeated character in a string. 4.Count the
	 * occurrences of each character in a string. 5.Check if two strings are
	 * anagrams of each other.
	 */

	public static void main(String[] args) {

		String str = "lsdjf sdlkfj sdkfjs";

		String[] split = str.split(" ");
		int count = 0;
		for (String s : split) {
			count++;
		}
		System.out.println("Total Word is : " + count);

		System.out.println("==========Remove Duplicates=================");

		String str2 = "abcdefabc";
		String duplicateremove = "";

		String[] duplicate = str2.split("");

		for (int i = 0; i < duplicate.length; i++) {
			int c = 0, v = 0;
			for (int j = 0; j < duplicate.length; j++) {

				if (duplicate[i].equals(duplicate[j]) && i >= j)
					c++;
				if (duplicate[i].equals(duplicate[j]) && i < j)
					v++;

			}
			if (c >= 1 && v == 0) {
				duplicateremove = duplicateremove + duplicate[i];
			}
		}

		System.out.println(duplicateremove);

		System.out.println("===================================");
		String str3 = "abcdefabc";
		String result = "";

		for (int i = 0; i < str3.length(); i++) {
			boolean isDuplicate = false;

			for (int j = 0; j < i; j++) {
				if (str3.charAt(i) == str3.charAt(j)) {
					isDuplicate = true;
					break;
				}
			}

			if (!isDuplicate) {
				result += str3.charAt(i);
			}
		}

		System.out.println(result);

		System.out.println("==========find the first non repeatable character  =================");

		String word = "abcbad";
		// char firstNonRepeated = '\0';

		for (int i = 0; i < word.length(); i++) {
			boolean isRepeated = false;

			for (int j = 0; j < word.length(); j++) {
				if (i != j && word.charAt(i) == word.charAt(j)) {
					isRepeated = true;
					break;
				}
			}

			if (!isRepeated) {
				System.out.println(word.charAt(i));
				break; // stop at the first non-repeated character
			}
		}

		// System.out.println("First non-repeated character: " + firstNonRepeated);
		System.out.println("===============first non repeated  Typed Programm===============");

		String letter = "abcdebdafd";

		String[] letSplit = letter.split("");

		for (int i = 0; i < letSplit.length; i++) {
			int c = 0, v = 0;
			for (int j = 0; j < letSplit.length; j++) {

				if (letSplit[i].equals(letSplit[j]) && i >= j)
					c++;
				if (letSplit[i].equals(letSplit[j]) && i < j)
					v++;

			}

			if (c == 1 && v == 0) {
				System.out.print(letSplit[i]);
				break;

			}
		}

		System.out.println("\n\n=====================Count is the occurence of each Char=======");

		String sentence = "sldfjslfjsdfjewwlsj";

		String senArray[] = sentence.split("");

		for (int i = 0; i < senArray.length; i++) {
			int c = 0;

			boolean alreadyCounted = false;

			for (int k = 0; k < i; k++) {

				if (senArray[i].equals(senArray[k])) {

					alreadyCounted = true;
					break;
				}

			}

			if (!alreadyCounted) {

				for (int j = 0; j < senArray.length; j++) {

					if (senArray[i].equals(senArray[j]) && i >= i)
						c++;
				}

				System.out.println(senArray[i] + "=========>" + c);
			}
		}

		System.out.println("=================one more way==========");

		String shabd = "abcdefabcde";

		for (int i = 0; i < shabd.length(); i++) {
			int c = 0;
			for (int j = 0; j < shabd.length(); j++) {

				if (shabd.charAt(i) == shabd.charAt(j))
					c++;
			}

			boolean printed = false;

			for (int k = 0; k < i; k++) {

				if (shabd.charAt(i) == shabd.charAt(k))
					printed = true;
			}

			if (!printed)
				System.out.println(shabd.charAt(i) + "--->" + c);
		}

		checkAnagramString();

	}

	public static void checkAnagramString() {
		System.out.println("=====================");
		String str1 = "kvikee";
		String str2 = "viivek";

		if (str1.length() != str2.length()) {
			System.out.println("String are not Anagram");
			return;
		}
 
		 char[] lett  = str2.toCharArray();
		 
		 boolean isAnagram = true;
		 
		 for (int i = 0; i < str1.length(); i++) {
			 boolean isFound = false;
			 for (int j = 0; j < lett.length; j++) {
				 
				 if(str1.charAt(i) == lett[j]) {
					 isFound = true;
					 lett[j] = 0;
					 break;
					 
				 }
			}
			 
			 if(!isFound) {
				 isAnagram = false;
			 }
			}
		 
		 if(isAnagram) {
			 System.out.println("String is anagram");
		 }else {
			 System.out.println("String is not anagram");
		 }
	}

}
