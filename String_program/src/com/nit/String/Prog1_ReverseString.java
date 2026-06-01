package com.nit.String;

import java.util.Arrays;

public class Prog1_ReverseString {

	public static void main(String[] args) {

		// Approach 1
		String str = "hello";
		String str2 = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			str2 += str.charAt(i);

		}
		String[] split = str.split("");

		for (int i = split.length - 1; i >= 0; i--) {
			str2 = str2 + split[i];
		}

		System.out.print(str2);

		// approach 2

		String s = "magnetic";

		String ch[] = s.split("");

		int end =  s.length() -1;
		System.out.println(end);
		int start = s.indexOf(ch[0]);
		System.out.println(start);

		while (start < end) {

			String temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			start++;
			end--;

		}
		
		
		 
		System.out.println(Arrays.toString(ch));

	}

}
