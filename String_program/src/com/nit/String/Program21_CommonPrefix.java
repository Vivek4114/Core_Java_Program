package com.nit.String;

public class Program21_CommonPrefix {

	public static String prefixChecker(String... strs) {

		if (strs == null || strs.length == 0) {
			return "";
		}

		String firstWord = strs[0];
		
		for (int i = firstWord.length(); i > 0; i--) {
			String prefix = firstWord.substring(0, i);
			boolean found = true;

			for (int j = 1; j < strs.length; j++) {

				if (!strs[j].startsWith(prefix)) {
					found = false;
					break;
				}
			}

			if (found) {
				return prefix;
			}
		}

		return "";
	}

	public static String checkPrefix(String... str) {

		String s[] = str;
		String resultStr = "";
		for (int i = 0; i < s.length; i++) {

			String word = s[i];

			for (int j = 0; j < word.length(); j++) {
				for (int k = 1; k < word.length(); k++) {
					if (j < k) {
						String sub = word.substring(j, k);
						resultStr += sub + " ";
						System.out.println(sub);

					}
				}
				break;

			}

		}

		String ot = "";
		String[] newS = resultStr.split(" ");

		for (int i = 0; i < newS.length; i++) {

			for (int j = i + 1; j < newS.length - 1; j++) {
				if (newS[i].equals(newS[j])) {
					ot += newS[i] + "  ";
				}
			}
		}

		if (!ot.isEmpty()) {
			return ot;
		} else {
			return "";
		}

	}

	public static void main(String[] args) {

		String checkPrefix = prefixChecker("flower", "fly", "flight", "flim");
		System.out.println(checkPrefix);
		
		String r2 = prefixChecker("Dog","Donkey", "Doggy", "Domble", "Doremon");
		System.out.println(r2);
		
		String r3 = prefixChecker("internal","internet","interview");
		System.out.println(r3);
		
		String r4 = prefixChecker("car", "racecar", "buscar");
		System.out.println(r4);

	}

}

//    public static void main(String[] args) {
//        // Test case 1
//        String result1 = longestCommonPrefix("flower", "fly", "flight", "flim");
//        System.out.println("Longest common prefix: " + result1); // Output: fl
//        
//        // Test case 2
//        String result2 = longestCommonPrefix("dog", "racecar", "car");
//        System.out.println("Longest common prefix: " + result2); // Output: (empty)
//        
//        // Test case 3
//        String result3 = longestCommonPrefix("interview", "internet", "internal");
//        System.out.println("Longest common prefix: " + result3); // Output: inte
//    }
//},