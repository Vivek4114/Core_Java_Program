package com.nit.Anagramchecker;

import java.util.Arrays;

public class StringPalindrome {

	public static void main(String[] args) {

		String str = "madam";

		String str2 = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			str2 += str.charAt(i);
		}

		if (str.equals(str2)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not Palindrome");
		}

		System.out.println("==========================");
		String s1 = "madam";
		System.out.println("s1 String before checking " + s1);

		char arr[] = s1.toCharArray();
		char brr[] = s1.toCharArray();

		int start = s1.indexOf(arr[0]);
		System.out.println(start);
		int end =  arr.length - 1;
		System.out.println(end);
		
		while(start < end) {
			
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end]= temp ;
			start++;
			end--;
			
		}
		
		
		
		if(Arrays.equals(arr, brr)) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not Palindrome");
		}
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println("========================");

		
		
		String a  = "The quick brow fox jumps over the lazy dog".toLowerCase();
		boolean isPangram = true;
		for(char ch = 'a'; ch<='z';  ch++) {
			
			if(a.indexOf(ch)==-1) {
				 isPangram = false;
				break;
			}
		}
		
		if(isPangram) {
			System.out.println("String is panagram ");
		}else {
			System.out.println("String is not Panagram");
		}
		System.out.println("========================");
		
	}

}
