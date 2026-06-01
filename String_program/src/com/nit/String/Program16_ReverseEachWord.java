package com.nit.String;


public class Program16_ReverseEachWord {
	public static void main(String[] args) {

		String str = "madam madam madam madam madam";

		String[] split = str.split(" ");

		for (int i = 0; i < split.length; i++) {

			String temp = split[i];
			String str2 = "";

			for (int j = temp.length() - 1; j >= 0; j--) {

				str2 += temp.charAt(j);
			}
			System.out.println(str2);
			str2 = "";

		}

		System.out.println("===================================");

		String word = "madam madam madam madam madam";

		String[] warr = word.split(" ");
		
		for (int i = 0; i < warr.length; i++) {

			String st = warr[i];
			char[] larr = st.toCharArray();
			int start = st.indexOf(larr[0]);
			int end = larr.length - 1;

			while (start < end) {
				char temp = larr[start];
				larr[start] = larr[end];
				larr[end] = temp;
				start++;
				end--;

			}

			String string =  String.valueOf(larr);
			//String replace = string.replace(",", "");
			 System.out.println(string);
		}

	}

}
